package org.example.File;

public abstract class AbstractFile implements File {
    final String name;
    final int size;

    public AbstractFile(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }
}
