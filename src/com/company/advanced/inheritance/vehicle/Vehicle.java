package com.company.advanced.inheritance.vehicle;

public class Vehicle {
    private String speed;
    private String model;

    public Vehicle(String speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public String getSpeed() {
        return this.speed;
    }

    public String getModel() {
        return  this.model;
    }
}
