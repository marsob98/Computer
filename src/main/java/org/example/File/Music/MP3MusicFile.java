package org.example.File.Music;

import org.example.File.FileType;

public class MP3MusicFile extends AbstractMusicFile {

    public MP3MusicFile(String name, int size, String author, String title) {
        super(name, size, author, title);
    }


    @Override
    public FileType getFileType() {
        return FileType.MUSIC;
    }

}
