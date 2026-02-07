package org.example.USBDevices;

public class MemoryStick implements USBDevice {
    String name;
    private boolean ejected = false;


    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Pamięć podłączona");
        return true;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("Najpierw bezpiecznie wyłączam");
            eject();
        }

        System.out.println("Odłączone");
        return true;
    }


    public void eject() {
        ejected = true;
    }


    @Override
    public String getName() {
        return name;
    }
}
