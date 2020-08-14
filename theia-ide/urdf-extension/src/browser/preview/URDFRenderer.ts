import * as BABYLON from '@babylonjs/core/Legacy/legacy';
import '@babylonjs/loaders';
import { AdvancedDynamicTexture, Control, Slider, StackPanel, TextBlock } from '@babylonjs/gui/2D';
import { AbstractMesh, ArcRotateCamera, TransformNode, Material } from '@babylonjs/core/Legacy/legacy';
import { BaseModel, JointInfo, RobotDescription } from './UrdfModel';


/**
 * This component is used to render 'RobotDescription' models.
 */
export class URDFRenderer {
  private scene: BABYLON.Scene;
  private idMeshMap = new Map<string, AbstractMesh>();
  private idMaterialMap = new Map<string, Material>();

  private menuPanel: StackPanel;

  public attachCanvas(canvas: HTMLCanvasElement) {
    const engine = new BABYLON.Engine(canvas, true);
    this.createScene(engine, canvas);
  }

  private createScene(engine: BABYLON.Engine, canvas: HTMLCanvasElement) {
    this.scene = new BABYLON.Scene(engine);
    this.scene.clearColor = BABYLON.Color4.FromInts(0, 0, 0, 0);

    const camera = new BABYLON.ArcRotateCamera('camera', 0, Math.PI / 4, 3, BABYLON.Vector3.Zero(), this.scene);
    camera.wheelPrecision = 100;
    camera.lowerRadiusLimit = 2;
    camera.upperRadiusLimit = 10;

    camera.attachControl(canvas, true);
    new BABYLON.HemisphericLight('hs-light', new BABYLON.Vector3(1, 1, 0), this.scene);

    const menuTexture = AdvancedDynamicTexture.CreateFullscreenUI("menu", true, this.scene);
    this.menuPanel = new StackPanel();
    this.menuPanel.width = "120px";
    this.menuPanel.horizontalAlignment = Control.HORIZONTAL_ALIGNMENT_RIGHT;
    this.menuPanel.verticalAlignment = Control.VERTICAL_ALIGNMENT_TOP;
    this.menuPanel.paddingRight = 5;
    menuTexture.addControl(this.menuPanel);

    engine.runRenderLoop(() => {
      this.scene.render();
    });

  }

  public resize(): void {
    this.scene?.getEngine().resize();
  }

  public resetModel() {
    this.idMeshMap.forEach(mesh => { mesh.material?.dispose(); mesh.dispose(); });
    this.menuPanel.clearControls();
  }

  highlightMeshes(ids: string[]) {
    this.idMeshMap.forEach((mesh: AbstractMesh, id: string) => {
      if (mesh.material) {
        mesh.material.alpha = ids.length == 0 || ids.includes(id) ? 1.0 : 0.4;
      }
    });
  }

  public resetView() {
    const camera = this.scene.getCameraByID("camera") as ArcRotateCamera;
    camera.alpha = 0;
    camera.beta = Math.PI / 4;
    camera.setTarget(BABYLON.Vector3.Zero());
  }

  public initRobotModel(robot: RobotDescription) {
    this.setupMaterials(robot);
    this.setupBoxes(robot);
    this.setupCylinders(robot);
    this.setupSpheres(robot);
    this.setupMeshes(robot);
    this.idMaterialMap.forEach(material => material.dispose());
  }

  private setupCylinders(robot: RobotDescription) {
    for (const cylinder of robot.cylinders) {
      const mesh = BABYLON.MeshBuilder.CreateCylinder(cylinder.id, {
        height: cylinder.length,
        diameter: cylinder.radius * 2
      }, this.scene);
      this.setupBaseProperties(mesh, cylinder);
      this.idMeshMap.set(cylinder.id, mesh);
    }
  }

  private setupBoxes(robot: RobotDescription) {
    for (const box of robot.boxes) {
      const mesh = BABYLON.MeshBuilder.CreateBox(box.id, {
        width: box.length,
        depth: box.width,
        height: box.height
      }, this.scene);
      this.setupBaseProperties(mesh, box);
      this.idMeshMap.set(box.id, mesh);
    }
  }

  private setupSpheres(robot: RobotDescription) {
    for (const sphere of robot.spheres) {
      const mesh = BABYLON.MeshBuilder.CreateSphere(sphere.id, {
        diameter: sphere.radius * 2, segments: 32
      }, this.scene);

      this.setupBaseProperties(mesh, sphere);
      this.idMeshMap.set(sphere.id, mesh);
    }
  }

  private setupMeshes(robot: RobotDescription) {
    const assetsManager = new BABYLON.AssetsManager(this.scene);
    for (const meshVisual of robot.meshVisuals) {

      const rootUrl = encodeURI(meshVisual.fileName) + '&sceneName=';
      const meshTask = assetsManager.addMeshTask(meshVisual.fileName, meshVisual.id, rootUrl, 'mesh.stl');
      meshTask.onSuccess = (task) => {
        if (task.loadedMeshes.length == 1) {
          const loadedMesh = task.loadedMeshes[0];
          this.idMeshMap.set(meshVisual.id, loadedMesh);
          this.setupBaseProperties(loadedMesh, meshVisual);
          loadedMesh.scaling = new BABYLON.Vector3(this.getScaleFactor(meshVisual.scaleX), this.getScaleFactor(meshVisual.scaleY), this.getScaleFactor(meshVisual.scaleZ));
        }
      };
    }

    assetsManager.onFinish = tasks => {
      this.connectMeshes(robot);
    }

    assetsManager.load();
  }

  private getScaleFactor(scale: number) {
    return scale > 0 ? scale : 1.0;
  }

  private setupMaterials(robot: RobotDescription) {
    for (const color of robot.colors) {
      const colorMaterial = new BABYLON.StandardMaterial(color.id, this.scene);
      colorMaterial.diffuseColor = new BABYLON.Color3(color.red, color.green, color.blue);
      colorMaterial.alpha = color.alpha;
      colorMaterial.zOffset = robot.colors.indexOf(color);
      this.idMaterialMap.set(color.id, colorMaterial);

    }
    for (const texture of robot.textures) {
      const textureMaterial = new BABYLON.StandardMaterial(texture.id, this.scene);
      textureMaterial.diffuseTexture = new BABYLON.Texture(texture.fileName, this.scene);
      textureMaterial.zOffset = robot.textures.indexOf(texture);
      this.idMaterialMap.set(texture.id, textureMaterial);
    }
  }

  private setupBaseProperties(mesh: AbstractMesh, model: BaseModel) {
    mesh.position = new BABYLON.Vector3(model.x, model.y, model.z);
    mesh.rotation = new BABYLON.Vector3(model.roll, model.pitch, model.yaw);    
    const material= this.idMaterialMap.get(model.materialId);
    if(material){
      mesh.material = material.clone(mesh.name + "-material");
    }
  }

  private connectMeshes(robot: RobotDescription) {
    for (const joint of robot.joints) {

      const transform = new BABYLON.TransformNode(joint.id);
      transform.position = new BABYLON.Vector3(joint.x, joint.y, joint.z);
      transform.rotation = new BABYLON.Vector3(joint.roll, joint.pitch, joint.yaw);

      if (joint.type == 'revolute') {
        this.addControlForRevoluteJoint(joint, transform);
      }

      if (joint.type == 'continuous') {
        //not really continous but full clock- and counterclockwise rotation 
        joint.lowerLimit = -Math.PI * 2;
        joint.upperLimit = Math.PI * 2;
        this.addControlForRevoluteJoint(joint, transform);
      }

      const parent = this.idMeshMap.get(joint.parent);
      const child = this.idMeshMap.get(joint.child);
      if (child && parent) {
        transform.parent = parent.parent ? parent.parent : parent;
        child.parent = transform;
      }
    }
  }


  private addControlForRevoluteJoint(joint: JointInfo, transform: TransformNode) {
    if (joint.upperLimit == 0 && joint.lowerLimit == 0) {
      return
    }

    const header = new TextBlock();
    this.setHeaderText(header, joint.id, 0);
    header.height = "20px";
    header.paddingTop = 2;
    header.fontSize = 10;
    header.color = "grey";

    const slider = new Slider();
    slider.minimum = joint.lowerLimit;
    slider.maximum = joint.upperLimit;
    slider.value = (joint.upperLimit + joint.lowerLimit) / 2;
    slider.height = "12px";
    slider.color = "green";

    slider.onValueChangedObservable.add(value => {
      transform.rotation = new BABYLON.Vector3(joint.roll, joint.pitch, joint.yaw);
      transform.rotate(new BABYLON.Vector3(joint.axeX, joint.axeY, joint.axeZ), value, BABYLON.Space.LOCAL);
      this.setHeaderText(header, joint.id, value);
    });

    this.menuPanel.addControl(header);
    this.menuPanel.addControl(slider);
  }

  private setHeaderText(header: TextBlock, name: String, value: number) {
    header.text = name + ": " + value.toFixed(2);
  }

}
