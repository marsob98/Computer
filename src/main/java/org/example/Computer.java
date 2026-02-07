package org.example;

import org.example.Drive.Drive;
import org.example.File.File;
import org.example.Monitor;
import org.example.USBDevices.USBDevice;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    Monitor monitor;
    Drive drive;

    public Computer(Monitor monitor, Drive drive) {
        this.monitor = monitor;
        this.drive = drive;
    }

    private List<USBDevice> usbDeviceList = new ArrayList<>();


    public void addFile(File file) {
        drive.addFile(file);
    }

    public void deleteFile(File file) {
        drive.deleteFile(file);
    }

    public File findFile(String file) {
        return drive.findFile(file);

    }
    public void listFile() {
        drive.listFiles();
    }


    public void addUSBDevice(USBDevice usbDevice) {
        usbDeviceList.add(usbDevice);
        usbDevice.connect();
    }

    public void deleteUSBDevice(USBDevice usbDevice) {
        usbDeviceList.remove(usbDevice);
        usbDevice.disconnect();
    }

    public void listUSBDevices() {
        for (USBDevice device : usbDeviceList) {
            System.out.println(device.getName());
        }
    }


}
