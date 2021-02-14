package com.company.designpatterns.behavioral.command;

public class InstrumentPanel {

    Command[] commands = new Command[2];

    public InstrumentPanel() {
    }

    public void setCommand(int i, Command command) {
        commands[i] = command;
    }

    public void lowerLandingGear() {
        commands[0].execute();
    }

    public void retractLandingGear() {
        commands[1].execute();
    }
}
