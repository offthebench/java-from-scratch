package com.company.designpatterns.structural.bridge;

public class Client {

    public static void main(String[] args) {

        testDevice(new Tv());
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {
        System.out.println("testing device with basic remote");

        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();

    }
}
