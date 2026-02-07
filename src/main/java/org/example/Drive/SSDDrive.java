package org.example.Drive;

import org.example.File.File;

import java.util.HashMap;
import java.util.Map;

public class SSDDrive implements Drive {

    Map<String, File> folder = new HashMap<>();
    @Override
    public void addFile(File file) {
        folder.put(file.getName(), file);
    }

    @Override
    public void listFiles() {
        for (String fileName : folder.keySet()) {
            System.out.println(fileName);
        }
    }

    @Override
    public void deleteFile(File file) {
        folder.remove(file.toString());
    }

    @Override
    public File findFile(String fileName) {
        if (folder.containsKey(fileName)) {
            return folder.get(fileName);
        }
        return null;
    }
}
