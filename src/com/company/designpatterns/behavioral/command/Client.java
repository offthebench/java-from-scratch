package com.company.designpatterns.behavioral.command;

public class Client {

    public static void main(String[] args) {
        LandingGear landingGear = new LandingGear();
        LandingGearDownCommand landingGearDownCommand = new LandingGearDownCommand(landingGear);
        LandingGearUpCommand landingGearUpCommand = new LandingGearUpCommand(landingGear);

        InstrumentPanel instrumentPanel = new InstrumentPanel();

        instrumentPanel.setCommand(0, landingGearUpCommand);
        instrumentPanel.setCommand(1, landingGearDownCommand);

        instrumentPanel.lowerLandingGear();
        instrumentPanel.retractLandingGear();
        instrumentPanel.lowerLandingGear();
    }
}
