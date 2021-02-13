package com.company.designpatterns.creational.builder;

public class Car extends CarBuilder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private int numberOfDoors;
    private int tripMeter;

    public Car(CarType carType, int seats, Engine engine, int numberOfDoors, int meter) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.numberOfDoors = numberOfDoors;
        this.tripMeter = meter;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getTripMeter() {
        return tripMeter;
    }

    @Override
    public void setTripMeter(int tripMeter) {
        this.tripMeter = tripMeter;
    }
}
