import { injectable } from 'inversify';
import { MonacoOutlineContribution, MonacoOutlineSymbolInformationNode } from '@theia/monaco/lib/browser/monaco-outline-contribution';
import URI from '@theia/core/lib/common/uri';
import DocumentSymbol = monaco.languages.DocumentSymbol;
import SymbolKind = monaco.languages.SymbolKind;

@injectable()
export class UrdfOutlineContribution extends MonacoOutlineContribution {

    protected createNodes(uri: URI, symbols: DocumentSymbol[]): MonacoOutlineSymbolInformationNode[] {
        if (!uri.displayName.endsWith("urdf")) {
            return super.createNodes(uri, symbols);
        }

        //flatten symbols tree 
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
            return SymbolKind.Variable;
        }
        if (type === 'link') {
            return SymbolKind.Object;
        }
        return SymbolKind.File;
    }

}

