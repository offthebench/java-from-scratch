package com.company.designpatterns.creational.builder;

public class CarBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private int numberOfDoors;
    private int tripMeter;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void setTripMeter(int miles) {
        this.tripMeter = tripMeter;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, numberOfDoors, tripMeter);
    }
}
