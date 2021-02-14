package com.company.designpatterns.behavioral.chainofresponsibility;

public class Client {

    public static void main(String[] args) {
        AbstractHandler lowFuel = new LowFuelHandler(null);
        FireHandler fireHandler = new FireHandler(lowFuel);

        FireDetectorRequest fireDetectorRequest = new FireDetectorRequest();
        LowFuelDetectorRequest lowFuelRequest = new LowFuelDetectorRequest();


        fireHandler.handleRequest(lowFuelRequest);
    }
}
