package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class MeshVisual extends Location {
    @NonNull
    private String id;

    @NonNull
    private String fileName;

    @NonNull
    private double scaleX;
    @NonNull
    private double scaleY;
    @NonNull
    private double scaleZ;

    private String materialId;

}
