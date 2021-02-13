package com.company.designpatterns.structural.bridge;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    void printStatus();
}
