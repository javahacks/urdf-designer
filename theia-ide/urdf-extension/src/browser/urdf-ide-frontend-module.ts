import { ContainerModule } from 'inversify';
import { UrdfIdeContribution } from './preview/urdf-ide-contribution';
import { LanguageClientContribution } from '@theia/languages/lib/browser';
import { DslClientContribution } from "./lsp/language-contribution";
import { bindViewContribution, FrontendApplicationContribution, WidgetFactory } from '@theia/core/lib/browser';
import { UrdfPreviewWidget } from "./preview/urdf-preview-widget";
import { TabBarToolbarContribution } from '@theia/core/lib/browser/shell/tab-bar-toolbar';
import { MonacoOutlineContribution } from '@theia/monaco/lib/browser/monaco-outline-contribution';
import { UrdfOutlineContribution} from './preview/outline-view-contribution';
import { SelectedLinkPublisher } from './preview/urdf-selection-publisher';


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
    rebind(MonacoOutlineContribution).to(UrdfOutlineContribution).inSingletonScope();
    bind(SelectedLinkPublisher).to(SelectedLinkPublisher).inSingletonScope();
});


