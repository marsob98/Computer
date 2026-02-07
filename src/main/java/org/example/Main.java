package org.example;


import org.example.Drive.SSDDrive;
import org.example.Drive.HDDDrive;
import org.example.File.Image.GIFImageFile;
import org.example.File.Image.JPGImageFile;
import org.example.File.Music.MP3MusicFile;

public class Main {
    public static void main(String[] args) {
        Monitor dell = new Monitor("Dell");

        MP3MusicFile file1 = new MP3MusicFile("file1", 3, "O.S.T.R." , "Coś tam1");
        MP3MusicFile file2 = new MP3MusicFile("file2", 2, "O.S.T.R." , "Coś tam2");
        MP3MusicFile file3 = new MP3MusicFile("file3", 3, "O.S.T.R." , "Coś tam3");
        MP3MusicFile file4 = new MP3MusicFile("file4", 4, "O.S.T.R." , "Coś tam4");

        GIFImageFile file5 = new GIFImageFile("file5", 4);
        JPGImageFile file6 = new JPGImageFile("file6", 4, 3);
        MP3MusicFile file7 = new MP3MusicFile("file7", 4, "O.S.T.R." , "Coś tam5");
        GIFImageFile file8 = new GIFImageFile("file8", 4);

        HDDDrive hddDrive = new HDDDrive();
        SSDDrive ssdDrive = new SSDDrive();
        Computer computer = new Computer(dell, ssdDrive);
        computer.add


    }
}
