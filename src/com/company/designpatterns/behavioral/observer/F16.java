package com.company.designpatterns.behavioral.observer;

import com.company.designpatterns.behavioral.mediator.Aircraft;

public class F16 implements Observer, Aircraft {

    Subject observable;

    String state;

    public F16(Subject observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void land() {
        observable.removeObserver(this);
    }

    @Override
    public void update(Object newState) {
        System.out.println("New state received");
    }
}
