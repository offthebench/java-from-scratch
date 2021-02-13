package com.company.designpatterns.structural.bridge;

public class Radio implements Device {

    private boolean on  = false;
    private int volume = 20;


    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }
    }

    @Override
    public void printStatus() {
        System.out.printf("Radio is %s at volume %s", on, volume);
    }
}
