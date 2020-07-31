import { ContainerModule, injectable } from 'inversify';
import { UrdfIdeContribution } from './preview/urdf-ide-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { DslClientContribution } from "./lsp/language-contribution";
import { bindViewContribution, FrontendApplicationContribution, WidgetFactory } from '@theia/core/lib/browser';
import { UrdfPreviewWidget } from "./preview/urdf-preview-widget";
import { TabBarToolbarContribution } from '@theia/core/lib/browser/shell/tab-bar-toolbar';
import { MonacoOutlineContribution, MonacoOutlineSymbolInformationNode } from '@theia/monaco/lib/browser/monaco-outline-contribution';
import DocumentSymbol = monaco.languages.DocumentSymbol;
import SymbolKind = monaco.languages.SymbolKind;
import URI from '@theia/core/lib/common/uri';


export default new ContainerModule((bind, unbind, isBound, rebind) => {
    bind<LanguageClientContribution>(LanguageClientContribution).to(DslClientContribution).inSingletonScope();
    bindViewContribution(bind, UrdfIdeContribution);
    bind(FrontendApplicationContribution).toService(UrdfIdeContribution);
    bind(TabBarToolbarContribution).toService(UrdfIdeContribution);
    bind(UrdfPreviewWidget).toSelf();
    bind(WidgetFactory).toDynamicValue(ctx => ({
        id: UrdfPreviewWidget.ID,
        createWidget: () => ctx.container.get<UrdfPreviewWidget>(UrdfPreviewWidget)
    })).inSingletonScope();
    rebind(MonacoOutlineContribution).to(CustomOutlineContribution).inSingletonScope();
});


@injectable()
class CustomOutlineContribution extends MonacoOutlineContribution {

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
            return SymbolKind.Constant;
        }
        if (type === 'link') {
            return SymbolKind.Object;
        }
        return SymbolKind.Module;
    }

}
