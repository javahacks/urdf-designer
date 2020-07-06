package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class SphereMesh extends Location {
    @NonNull
    private String id;
    @NonNull
    private double radius;

    private String materialId;
}
