package org.example.File.Image;

import org.example.File.File;
import org.example.File.FileType;

public class GIFImageFile extends AbstractImageFile {

    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void showGIF() {
        System.out.println("Pokazuje Gifa");
    }
}
