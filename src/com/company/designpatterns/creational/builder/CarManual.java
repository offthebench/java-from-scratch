package com.company.designpatterns.creational.builder;

public class CarManual extends CarManualBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private int numberOfDoors;

    public CarManual(CarType carType, int seats, Engine engine, int numberOfDoors) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "CarManual{" +
                "carType=" + carType +
                ", seats=" + seats +
                ", engine=" + engine +
                ", numberOfDoors=" + numberOfDoors +
                '}';
    }
}
