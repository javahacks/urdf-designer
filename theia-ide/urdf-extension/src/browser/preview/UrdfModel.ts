class RobotDescription {
  colors: ColorMaterial[];
  textures: TextureMaterial[];
  boxes: BoxMesh[];
  cylinders: CylinderMesh[];
  spheres: SphereMesh[];
  meshVisuals: MeshVisual[];
  joints: JointInfo[];
}

class BaseModel {
  id: string;
  materialId: string;
  x: number;
  y: number;
  z: number;
  roll: number;
  pitch: number;
  yaw: number;
}

class BoxMesh extends BaseModel {
  length: number;
  width: number;
  height: number;
}

class CylinderMesh extends BaseModel {
  length: number;
  radius: number;
}

class SphereMesh extends BaseModel {
  radius: number;
}

class MeshVisual extends  BaseModel{
  fileName: string;
  scaleX: number;
  scaleY: number;
  scaleZ: number;
}

class ColorMaterial {
  id: string;
  red: number;
  green: number;
  blue: number;
  alpha: number;
}

class TextureMaterial {
  id: string;
  fileName: string;
}

class JointInfo extends BaseModel {
  id: string;
  type: string;
  parent: string;
  child: string;
  axeX:number;
  axeY:number;
  axeZ:number;
  lowerLimit:number;
  upperLimit:number;
}


export {RobotDescription, BaseModel,JointInfo};
