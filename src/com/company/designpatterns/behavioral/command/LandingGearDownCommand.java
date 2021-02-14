package com.company.designpatterns.behavioral.command;

public class LandingGearDownCommand implements Command {

    LandingGear landinggear;

    public LandingGearDownCommand(LandingGear landinggear) {
        this.landinggear = landinggear;
    }

    @Override
    public void execute() {
        landinggear.down();
    }
}
