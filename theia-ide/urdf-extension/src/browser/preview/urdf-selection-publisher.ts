///<reference types='@theia/monaco/src/typings/monaco'/>
import { injectable, inject, postConstruct } from 'inversify';
import { EditorManager, TextEditorSelection, Range, Position } from '@theia/editor/lib/browser';
import { MonacoEditor } from '@theia/monaco/lib/browser/monaco-editor';
import DocumentSymbol = monaco.languages.DocumentSymbol;
import { SelectionService, CancellationTokenSource } from '@theia/core';


export class LinkSelection {
    public readonly linkIds: string[]

    constructor(linkIds: string[]) {
        this.linkIds = linkIds;
    }
}

/**
 * Propagades the currently selected URDF link to the global SelectionService
 */
@injectable()
export class SelectedLinkPublisher {

    @inject(SelectionService) selectionService: SelectionService;
    @inject(EditorManager) editorManager: EditorManager;

    @postConstruct()
    protected init(): void {
        this.selectionService.onSelectionChanged(selection => {
            if (TextEditorSelection.is(selection) && selection.selection) {
                this.updateSelection(selection.selection);
            }
        })
    }

    private async updateSelection(selectionRange: Range) {
        const tokenSource = new CancellationTokenSource();
        const token = tokenSource.token;

        const editor = MonacoEditor.get(this.editorManager.currentEditor);
        const model = editor && editor.getControl().getModel();
        if (model && model.uri.toString().endsWith(".urdf")) {

            const providers = monaco.modes.DocumentSymbolProviderRegistry.all(model);

            for (const provider of providers) {
                try {
                    const symbols = await provider.provideDocumentSymbols(model, token);
                    if (symbols && symbols.length == 1 && symbols[0].children) {
                        this.updateSelectedSymbols(symbols[0].children, selectionRange);
                    }


                } catch {
                    /* collect symbols from other providers */
                }
            }
        }
    }
    private updateSelectedSymbols(symbols: DocumentSymbol[], selectionRange: Range) {

        const ids: string[] = [];

        for (let symbol of symbols) {
            const symbolRange = this.asRange(symbol.range);
            if (this.isLink(symbol) && this.before(symbolRange.start, selectionRange.start)
                && this.before(selectionRange.end,symbolRange.end)) {                
                    ids.push(symbol.name.split(".")[1]);                
            }
        }

        this.selectionService.selection = new LinkSelection(ids);
    }

    private isLink(symbol: DocumentSymbol) {
        return symbol.name.startsWith("link.");
    }

    private before(p1: Position, p2: Position) {
        return p1.line < p2.line || (p1.line==p2.line &&  p1.character <= p2.character);
    }

    /**
    * `monaco` to LSP `Range` converter. Converts the `1-based` location indices into `0-based` ones.
    */
    protected asRange(range: monaco.IRange): Range {
        const { startLineNumber, startColumn, endLineNumber, endColumn } = range;
        return {
            start: {
                line: startLineNumber - 1,
                character: startColumn - 1
            },
            end: {
                line: endLineNumber - 1,
                character: endColumn - 1
            }
        };
    }
}
