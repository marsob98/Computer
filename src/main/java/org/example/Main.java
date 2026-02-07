package org.example;


import org.example.Drive.SSDDrive;
import org.example.Drive.HDDDrive;
import org.example.File.Image.GIFImageFile;
import org.example.File.Image.JPGImageFile;
import org.example.File.Music.MP3MusicFile;
import org.example.USBDevices.MemoryStick;
import org.example.USBDevices.Mouse;

public class Main {
    public static void main(String[] args) {
        Monitor dell = new Monitor("Dell");
        Monitor dell1 = new Monitor("Dell");

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
        Computer computer1 = new Computer(dell1, hddDrive);

        computer.addFile(file1);
        computer.addFile(file2);
        computer.addFile(file3);
        computer.addFile(file4);
        computer.addFile(file5);
        computer.addFile(file6);
        computer.addFile(file7);
        computer.addFile(file8);

        computer.listFile();

        computer1.addFile(file1);
        computer1.addFile(file2);
        computer1.addFile(file3);
        computer1.addFile(file4);
        computer1.addFile(file5);
        computer1.addFile(file6);
        computer1.addFile(file7);
        computer1.addFile(file8);

        Mouse mouse = new Mouse("g502");
        MemoryStick memoryStick = new MemoryStick("Karta");

        computer1.addUSBDevice(mouse);
        computer1.addUSBDevice(memoryStick);
//        mouse.connect();
//        memoryStick.eject();
//        memoryStick.connect();


    }
}
