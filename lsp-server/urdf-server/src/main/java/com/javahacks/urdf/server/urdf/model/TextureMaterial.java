package com.javahacks.urdf.server.urdf.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class TextureMaterial {
    @NonNull
    private String id;
    @NonNull
    private String fileName;
}
