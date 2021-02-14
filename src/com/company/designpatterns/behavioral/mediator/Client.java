package com.company.designpatterns.behavioral.mediator;

public class Client {

    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();

        Boing aircraft = new Boing(controlTower);
        aircraft.requestControlTower();

        controlTower.run();
    }
}
