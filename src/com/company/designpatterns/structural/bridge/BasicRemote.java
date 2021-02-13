package com.company.designpatterns.structural.bridge;

public class BasicRemote implements Remote {

    protected Device device;

    public BasicRemote() {
    }

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Power Toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeUp() {
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void volumeDown() {
        device.setVolume(device.getVolume() - 10);
    }
}
