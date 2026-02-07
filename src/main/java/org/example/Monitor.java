package org.example;

public class Monitor {
    private final String name;
    private int width;
    private int height;

    public Monitor(String name) {
        this.name = name;
        setLowResolution();
    }

    public void setLowResolution() {
        this.width = 800;
        this.height = 600;
    }

    public void setHighResolution() {
        this.width = 1920;
        this.height = 1080;
    }

}
