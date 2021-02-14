package com.company.designpatterns.behavioral.state;

import com.company.designpatterns.behavioral.mediator.Aircraft;

public class F16 implements Aircraft {

    private ParkedState parkedState = new ParkedState(this);
    private LandingState landingState = new LandingState(this);

    PilotActions state;

    public ParkedState getParkedState() {
        return parkedState;
    }

    public void setParkedState(ParkedState parkedState) {
        this.parkedState = parkedState;
    }

    public LandingState getLandingState() {
        return landingState;
    }

    public void setLandingState(LandingState landingState) {
        this.landingState = landingState;
    }

    public PilotActions getState() {
        return state;
    }

    public void setState(PilotActions state) {
        this.state = state;
    }

    public F16() {
        state = parkedState;
    }

    @Override
    public void land() {
        state = landingState;
    }
}
