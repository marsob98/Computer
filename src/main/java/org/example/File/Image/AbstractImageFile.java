package org.example.File.Image;

import org.example.File.AbstractFile;
import org.example.File.FileType;

public abstract class AbstractImageFile extends AbstractFile {
    public AbstractImageFile(String name, int size) {
        super(name, size);
    }


    @Override
    public FileType getFileType() {
        return FileType.IMAGE;
    }

}
