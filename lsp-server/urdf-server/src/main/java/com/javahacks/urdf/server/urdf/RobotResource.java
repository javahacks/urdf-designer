package com.javahacks.urdf.server.urdf;

import com.javahacks.urdf.server.urdf.model.*;
import org.apache.commons.io.IOUtils;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.ros.model.urdf.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping(value = "urdf")
@CrossOrigin(origins = "*")
public class RobotResource {
    private final ModelConverter modelConverter;

    public RobotResource(@Autowired final ModelConverter modelConverter) {
        this.modelConverter = modelConverter;
    }

    @GetMapping(value = "model")
    public RobotDescription robotModel(@RequestParam final String fileName) throws IOException {
        return modelConverter.createDescription(fileName);
    }

    @GetMapping(value = "asset")
    @ResponseBody
    public ResponseEntity<InputStreamResource> getAsset(@RequestParam final String fileName) throws Exception {
        final Path texturePath = Paths.get(new URL(fileName).toURI());
        if(!Files.exists(texturePath)){
            return  ResponseEntity.noContent().build();
        }

        return ResponseEntity.ok()
                .contentLength(Files.size(texturePath))
                .contentType(MediaTypeFactory.getMediaType(fileName).orElse(MediaType.APPLICATION_OCTET_STREAM))
                .body(new InputStreamResource(Files.newInputStream(texturePath)));

    }

}

