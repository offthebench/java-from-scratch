package com.company.designpatterns.creational.builder;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setNumberOfDoors(int numberOfDoors);
    void setTripMeter(int miles);
}
