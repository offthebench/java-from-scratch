package com.company.designpatterns.behavioral.command;

public class LandingGearUpCommand implements Command {

    LandingGear landinggear;

    public LandingGearUpCommand(LandingGear landinggear) {
        this.landinggear = landinggear;
    }

    @Override
    public void execute() {
        landinggear.up();
    }
}
