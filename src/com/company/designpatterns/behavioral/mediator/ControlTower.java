package com.company.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ControlTower {

    List<Aircraft> queuedForLanding = new ArrayList<>();

    synchronized public void requestToLand(Aircraft aircraft) {
        queuedForLanding.add(aircraft);
    }

    public void run() {
        while (true) {

            while (queuedForLanding.size() == 0);
            Aircraft aircraft;
            synchronized (this) {
                aircraft = queuedForLanding.remove(0);
            }

            aircraft.land();
        }
    }
}
