package com.company.designpatterns.behavioral.state;

public interface PilotActions {
    void pilotTaxies(F16 f16);
    void pilotFlies(F16 f16);
    void pilotLands(F16 f16);
    void pilotParks(F16 f16);
}
