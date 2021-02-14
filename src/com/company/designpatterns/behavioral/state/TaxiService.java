package com.company.designpatterns.behavioral.state;

public class TaxiService {

    public static void main(String[] args) {
        F16 f16 = new F16();
        System.out.println(f16.getLandingState());
        f16.land();
    }

    public void pilotTaxis(String currentState) {

        if (currentState == "Parked") {
            currentState = "Taxi";
            System.out.println("Plane is taxing to runway.");
        } else if (currentState == "Airborne") {
            System.out.println("Invalid option.");
        } else if (currentState == "Land") {
            System.out.println("Invalid Option");
        } else if (currentState == "Taxi") {
            System.out.println("Pane is already taxing.");
        }

    }
}
