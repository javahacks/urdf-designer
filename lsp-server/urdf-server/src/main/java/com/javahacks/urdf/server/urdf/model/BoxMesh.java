package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class BoxMesh extends Location {
    @NonNull
    private String id;
    @NonNull
    private double length;
    @NonNull
    private double width;
    @NonNull
    private double height;

    private String materialId;
}
