package com.company.designpatterns.behavioral.observer;

public class Client {

    public static void main(String[] args) {
        ControlTower controlTower = new ControlTower();

        F16 f16 = new F16(controlTower);
        f16.land();

        controlTower.notifyObserver();

        f16.land();

        controlTower.notifyObserver();
    }
}
