package com.company.designpatterns.creational.builder;

public class Director {

    public void constructHatchBack(Builder builder) {
        builder.setCarType(CarType.HATCHBACK);
        builder.setEngine(Engine.V1);
        builder.setNumberOfDoors(5);
        builder.setSeats(4);
    }

    public void constructSedan(Builder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setEngine(Engine.V2);
        builder.setNumberOfDoors(5);
        builder.setSeats(4);
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setEngine(Engine.V5);
        builder.setNumberOfDoors(5);
        builder.setSeats(7);
    }

    public void constructTopdown(Builder builder) {
        builder.setCarType(CarType.TOPDOWN);
        builder.setEngine(Engine.V5);
        builder.setNumberOfDoors(5);
        builder.setSeats(7);
    }
}
