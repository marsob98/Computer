package org.example.Drive;

import org.example.File.File;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {
    List<File> folder = new ArrayList<>();


    @Override
    public void addFile(File file) {
        folder.add(file);
    }

    @Override
    public void listFiles() {
        for (File file : folder) {
            System.out.println(file.getName());
        }
    }

    @Override
    public File findFile(String fileName) {
        for (File file : folder) {
            if (fileName.equals(file.getName())) {
                return file;
            }
        }

        return null;
    }

    @Override
    public void deleteFile(File file) {
        folder.remove(file);
    }
}
