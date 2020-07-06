package com.javahacks.urdf.server.urdf.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RobotDescription {
    private final List<ColorMaterial> colors = new ArrayList<>();
    private final List<TextureMaterial> textures = new ArrayList<>();
    private final List<BoxMesh> boxes = new ArrayList<>();
    private final List<CylinderMesh> cylinders = new ArrayList<>();
    private final List<SphereMesh> spheres = new ArrayList<>();
    private final List<MeshVisual> meshVisuals = new ArrayList<>();
    private final List<JointInfo> joints = new ArrayList<>();
}


