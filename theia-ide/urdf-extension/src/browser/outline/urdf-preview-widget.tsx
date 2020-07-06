import * as React from 'react';
import { injectable, postConstruct, inject } from 'inversify';
import { ReactWidget } from '@theia/core/lib/browser/widgets/react-widget';
import { Workspace  } from '@theia/languages/lib/browser';
import { EditorManager } from '@theia/editor/lib/browser';

import { URDFRenderer } from './URDFRenderer';
import { RobotDescription } from './UrdfModel';
import { waitForRevealed } from '@theia/core/lib/browser';


@injectable()
export class UrdfPreviewWidget extends ReactWidget {
    static readonly ID = 'urdf-preview:widget';
    static readonly LABEL = 'URDF Preview';
    renderer:URDFRenderer = new URDFRenderer();

    @inject(Workspace) workspace:Workspace;   
    @inject(EditorManager) editorManager:EditorManager;   
    
    @postConstruct()
    protected init():void {
        this.id = UrdfPreviewWidget.ID;
        this.title.label = UrdfPreviewWidget.LABEL;
        this.title.caption = UrdfPreviewWidget.LABEL;
        this.title.closable = false;
        this.title.iconClass = 'fa fa-cube';             
        this.update();
        waitForRevealed(this).then(w=>this.initGui());        
    }

    private initGui() {                     
        const canvas: any = document.getElementById('renderCanvas');                
        this.renderer.attachCanvas(canvas);                    
        this.toDispose.push(this.workspace.onDidSaveTextDocument!(e=>this.updateEditor()));                                                                                  
        this.toDispose.push(this.editorManager.onCurrentEditorChanged(e=>this.updateEditor()));                
    }

    
    private updateEditor(){        
        this.renderer.resetModel();
        if(this.editorManager.currentEditor){            
            const uri=this.editorManager.currentEditor.getResourceUri()!.toString();
            this.fetchAndSetRobotModel(uri)
        }                
    }

    resetView(){        
        this.renderer.resetView();
    }

    protected render(): React.ReactNode {           
        return <canvas id="renderCanvas" style={ { height: '99%', width: '99%', padding:'2px',outlineStyle:'none' } }></canvas>               
    }
    
    protected onResize():void {                 
        this.renderer.resize();                
    }

    async fetchAndSetRobotModel(uri: string) {    
        if(uri?.toLowerCase().endsWith('urdf')){            
            return fetch('urdf/model?fileName=' + encodeURI(uri))
          .then(res => res.json())
          .then(res => res as RobotDescription)
          .then(res => this.renderer.initRobotModel(res));
        }
    }

}
