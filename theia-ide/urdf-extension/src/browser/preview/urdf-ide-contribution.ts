import { injectable, inject } from 'inversify';
import { AbstractViewContribution, FrontendApplication, FrontendApplicationContribution } from '@theia/core/lib/browser';
import { Command, CommandRegistry } from '@theia/core/lib/common/command';
import { Workspace } from '@theia/languages/lib/browser';
import { EditorManager } from '@theia/editor/lib/browser';
import { UrdfPreviewWidget } from "./urdf-preview-widget";
import { DisposableCollection, SelectionService } from '@theia/core';
import { RobotDescription } from './UrdfModel';
import { TabBarToolbarRegistry, TabBarToolbarContribution } from '@theia/core/lib/browser/shell/tab-bar-toolbar';
import { SelectedLinkPublisher, LinkSelection } from './urdf-selection-publisher';
export const UrdfIdeCommand: Command = { id: 'urdf-ide:command' };

@injectable()
export class UrdfIdeContribution extends AbstractViewContribution<UrdfPreviewWidget> implements FrontendApplicationContribution, TabBarToolbarContribution {
    private readonly toDisposeOnClose = new DisposableCollection();

    @inject(SelectionService) selectionService: SelectionService;
    @inject(Workspace) workspace: Workspace;
    @inject(EditorManager) editorManager: EditorManager;
    @inject(SelectedLinkPublisher) publisher: SelectedLinkPublisher;

    constructor() {
        super({
            widgetId: UrdfPreviewWidget.ID,
            widgetName: UrdfPreviewWidget.LABEL,
            defaultWidgetOptions: { area: 'right', rank: 1000 },
            toggleCommandId: UrdfIdeCommand.id
        });
    }

    onStart(app: FrontendApplication): void {
        this.toDisposeOnClose.push(this.workspace.onDidSaveTextDocument!(e => this.updateEditor()));
        this.toDisposeOnClose.push(this.editorManager.onCurrentEditorChanged(e => this.updateEditor()));
        this.toDisposeOnClose.push(this.selectionService.onSelectionChanged(selection => this.updateSelectedNodes(selection)));
    }

    onStop(app: FrontendApplication): void {
        this.toDisposeOnClose.dispose();
    }

    async initializeLayout(app: FrontendApplication): Promise<void> {
        await this.openView(); //show view by default
    }

    registerCommands(commands: CommandRegistry): void {
                
    commands.registerCommand(UrdfIdeCommand, {
            execute: () => super.openView({ activate: true, reveal: true })
        });
        commands.registerCommand(PreviewCommands.RESET_VIEW, {
            isEnabled: widget => widget instanceof UrdfPreviewWidget,
            isVisible: widget => widget instanceof UrdfPreviewWidget,
            execute: () => this.resolvePreviewWIdget()?.resetView()
        });        
    }


    private updateSelectedNodes(selection: any) {
        if (selection instanceof LinkSelection) {
            const linkSelection = selection as LinkSelection;
            this.resolvePreviewWIdget()?.setSelection(linkSelection.linkIds);            
        }
    }

    private updateEditor() {        
        this.resolvePreviewWIdget()?.dispose();
        if (this.editorManager.currentEditor) {
            const uri = this.editorManager.currentEditor.getResourceUri()!.toString();
            this.fetchAndSetRobotModel(uri)
        }
    }

    async fetchAndSetRobotModel(uri: string) {
        if (uri?.toLowerCase().endsWith('urdf')) {
            return fetch('urdf/model?fileName=' + encodeURI(uri))
                .then(res => res.json())
                .then(res => res as RobotDescription)
                .then(model => this.resolvePreviewWIdget()?.initModel(model));
        }
    }

    private resolvePreviewWIdget(): UrdfPreviewWidget {
        return this.tryGetWidget() as UrdfPreviewWidget;
    }

    registerToolbarItems(toolbar: TabBarToolbarRegistry): void {
        toolbar.registerItem({
            id: PreviewCommands.RESET_VIEW.id,
            command: PreviewCommands.RESET_VIEW.id,
            tooltip: 'Reset Camera',
            priority: 0
        });                
    }
}

export namespace PreviewCommands {

    export const RESET_VIEW: Command = {
        id: 'preview.reset.view',
        iconClass: 'fa fa-crosshairs'
    };

    /**
     * Toggle feature not yet implemented https://github.com/eclipse-theia/theia/issues/8312
     */
    export const LINK_WITH_EDITOR: Command = {
        id: 'preview.link.editor',
        iconClass: 'fa fa-crosshairs'        
    };

}


