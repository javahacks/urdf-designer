import { injectable } from 'inversify';
import {AbstractViewContribution, FrontendApplication, FrontendApplicationContribution} from '@theia/core/lib/browser';
import { Command, CommandRegistry } from '@theia/core/lib/common/command';
import {UrdfPreviewWidget} from "./urdf-preview-widget";
import { TabBarToolbarRegistry,TabBarToolbarContribution } from '@theia/core/lib/browser/shell/tab-bar-toolbar';
export const UrdfIdeCommand: Command = { id: 'urdf-ide:command' };

@injectable()
export class UrdfIdeContribution extends AbstractViewContribution<UrdfPreviewWidget>  implements FrontendApplicationContribution,TabBarToolbarContribution{
    
    constructor() {
        super({
            widgetId: UrdfPreviewWidget.ID,
            widgetName: UrdfPreviewWidget.LABEL,
            defaultWidgetOptions: { area: 'right',rank: 1000 },
            toggleCommandId: UrdfIdeCommand.id
        });
    }

    async initializeLayout(app: FrontendApplication): Promise<void> {        
        await this.openView(); //show view by default
    }

    registerCommands(commands: CommandRegistry): void {
        commands.registerCommand(UrdfIdeCommand, {
            execute: () => super.openView({ activate: true, reveal: true })
        });      
        commands.registerCommand(PreviewCommands.RESET_VIEW, {
            isEnabled: widget  => widget instanceof UrdfPreviewWidget,
            isVisible: widget  => widget instanceof UrdfPreviewWidget,
            execute: () => this.refreshView()
        });    
    }


    private refreshView(){
        const widget=this.tryGetWidget() as UrdfPreviewWidget;
        widget.resetView();
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
}