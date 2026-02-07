package org.example.Drive;

import org.example.File.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    void deleteFile(File file);
    File findFile(String fileName);
}
