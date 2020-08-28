import * as React from 'react';
import { injectable, postConstruct } from 'inversify';
import { ReactWidget } from '@theia/core/lib/browser/widgets/react-widget';
import { URDFRenderer } from './URDFRenderer';
import { waitForRevealed } from '@theia/core/lib/browser';
import { RobotDescription } from './UrdfModel';


@injectable()
export class UrdfPreviewWidget extends ReactWidget {

    static readonly ID = 'urdf-preview:widget';
    static readonly LABEL = 'URDF Preview';
    private renderer: URDFRenderer;
    
    @postConstruct()
    protected init(): void {
        this.id = UrdfPreviewWidget.ID;
        this.title.label = UrdfPreviewWidget.LABEL;
        this.title.caption = UrdfPreviewWidget.LABEL;
        this.title.closable = false;
        this.title.iconClass = 'fa fa-cube';
        this.update();
        waitForRevealed(this).then(w => this.initGui());
    }

    private initGui() {
        const canvas: any = document.getElementById('renderCanvas');
        this.renderer = new URDFRenderer();
        this.renderer.attachCanvas(canvas);
    }

    initModel(model: RobotDescription) {
        this.renderer?.initRobotModel(model);
    }

    resetView() {
        this.renderer?.resetView();
    }

    dispose() {
        this.renderer?.dispose();
    }

    setSelection(ids: string[]) {
        this.renderer?.highlightMeshes(ids);
    }

    protected render(): React.ReactNode {
        return <canvas id="renderCanvas" style={{ height: '99%', width: '99%', padding: '2px', outlineStyle: 'none' }}></canvas>
    }

    protected onResize(): void {
        this.renderer?.resize();
    }


}
