package com.company.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.Collection;

public class ControlTower implements Subject {

    Collection<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(null);
        }
    }

    public void run() {
        while (true) {
            notifyObserver();
        }
    }
}
