package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class ColorMaterial {
    @NonNull
    private String id;
    @NonNull
    private float red;
    @NonNull
    private float green;
    @NonNull
    private float blue;
    @NonNull
    private float alpha;
}
