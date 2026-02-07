package org.example.File.Image;

import org.example.File.File;
import org.example.File.FileType;

public class JPGImageFile extends AbstractImageFile {
    int compression;

    public JPGImageFile(String name, int size, int compression) {
        super(name, size);
        this.compression = compression;
    }


    public void display() {
        System.out.println("Wyświetlam obraz");
    }
}
