package org.example.File.Music;

import org.example.File.AbstractFile;
import org.example.File.FileType;

public abstract class AbstractMusicFile extends AbstractFile implements MusicFile {
    final String author;
    final String title;


    public AbstractMusicFile(String name, int size, String author, String title) {
        super(name, size);
        this.author = author;
        this.title = title;
    }

    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }

    @Override
    public void play() {
        System.out.println("Odtwarzam plik");
    }
}
