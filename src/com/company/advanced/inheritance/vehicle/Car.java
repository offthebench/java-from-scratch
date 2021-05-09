package com.company.advanced.inheritance.vehicle;

public class Car extends Vehicle {
    private String carName;

    public Car(String carName, String model, String speed) {
        super(speed, model);
        this.carName = carName;
    }

    public void getDetails() {
        System.out.printf("%s, %s, %s",
                this.carName,
                super.getModel(),
                super.getSpeed());
    }
}
