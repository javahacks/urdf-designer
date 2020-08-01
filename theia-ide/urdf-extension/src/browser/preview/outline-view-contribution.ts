import {  injectable,inject } from 'inversify';
import { MonacoOutlineContribution, MonacoOutlineSymbolInformationNode } from '@theia/monaco/lib/browser/monaco-outline-contribution';
import {  OutlineSymbolInformationNode } from '@theia/outline-view/lib/browser/outline-view-widget'
import DocumentSymbol = monaco.languages.DocumentSymbol;
import SymbolKind = monaco.languages.SymbolKind;
import URI from '@theia/core/lib/common/uri';
import { Range,EditorOpenerOptions} from '@theia/editor/lib/browser';
import { Emitter, Event } from '@theia/core';
import { FrontendApplication } from '@theia/core/lib/browser';
import debounce = require('lodash.debounce');

@injectable()
export class OutlineChangedPublisher {

    private readonly onDidChangeOutlineEmitter = new Emitter<OutlineSymbolInformationNode[]>();

    get onDidChangeOutline(): Event<OutlineSymbolInformationNode[]> {
        return this.onDidChangeOutlineEmitter.event;
    }

    fire(roots: OutlineSymbolInformationNode[]) {
        this.onDidChangeOutlineEmitter.fire(roots);
    } 

}

@injectable()
export class UrdfOutlineContribution extends MonacoOutlineContribution {

    @inject(OutlineChangedPublisher) publisher:OutlineChangedPublisher;


    /**
     * The outline information should be published always even when outline view is invisible
     */
    onStart(app: FrontendApplication): void {
        this.toDisposeOnClose.push(this.toDisposeOnEditor);        
        this.toDisposeOnClose.push(this.editorManager.onCurrentEditorChanged(
            debounce(() => this.handleCurrentEditorChanged(), 50)
        ));
        this.handleCurrentEditorChanged();

        this.outlineViewService.onDidSelect(async node => {        
            if (MonacoOutlineSymbolInformationNode.is(node) && node.parent) {
                const options: EditorOpenerOptions = {
                    mode: 'reveal',
                    selection: node.range
                };
                await this.selectInEditor(node, options);
            }
        });
        this.outlineViewService.onDidOpen(async node => {
            if (MonacoOutlineSymbolInformationNode.is(node)) {
                const options: EditorOpenerOptions = {
                    selection: {
                        start: node.range.start
                    }
                };
                await this.selectInEditor(node, options);
            }
        });
    }
    


    protected async updateOutline(editorSelection?: Range): Promise<void> {        
        super.updateOutline(editorSelection);        
        this.publisher.fire(this.roots||[]);                
    }

    protected createNodes(uri: URI, symbols: DocumentSymbol[]): MonacoOutlineSymbolInformationNode[] {
        if (!uri.displayName.endsWith("urdf")) {
            return super.createNodes(uri, symbols);
        }
        if (symbols.length == 1 && symbols[0].children) {
            return symbols[0].children?.
                map(symbol => this.mapSymbol(symbol, uri))
        }

        return [];
    }

    private mapSymbol(symbol: DocumentSymbol, uri: URI) {
        const segments = symbol.name!.split(".");
        const type = segments[0];
        return this.createSymbolNode(uri, symbol.name, segments[1], this.getIconClass(type), symbol);
    }

    private createSymbolNode(uri: URI, id: string, name: string, symbolKind: SymbolKind, symbol: DocumentSymbol): MonacoOutlineSymbolInformationNode {
        const node: MonacoOutlineSymbolInformationNode = {            
            uri: uri,
            id: id,
            iconClass: SymbolKind[symbolKind].toString().toLowerCase(),
            name: name,
            children: [],
            parent: undefined,
            range: this.getNameRange(symbol),
            fullRange: this.getFullRange(symbol),
            selected: false,
            expanded: false
        };
        return node;
    }

    private getIconClass(type: string): SymbolKind {
         
        if (type === 'material') {
            return SymbolKind.File;
        }
        if (type === 'link') {
            return SymbolKind.Object;
        }
        return SymbolKind.Variable;
    }
  
}

