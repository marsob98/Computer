package org.example.USBDevices;

public class Mouse implements USBDevice {
    String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean connect() {
        System.out.println("Mysz podłączona");
        return true;
    }

    @Override
    public boolean disconnect() {
        System.out.println("Odłączam");
        return true;
    }
}
