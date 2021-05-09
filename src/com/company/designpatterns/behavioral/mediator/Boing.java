package com.company.designpatterns.behavioral.mediator;

public class Boing implements Aircraft {

    ControlTower controlTower;

    public Boing(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    public void land() {
        System.out.println("Boeing is landing");
    }

    public void requestControlTower() {
        controlTower.requestToLand(this);
    }
}
