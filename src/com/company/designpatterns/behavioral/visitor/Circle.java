package com.company.designpatterns.behavioral.visitor;

public class Circle implements Shape {
    int radius = 5;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void move(int x, int y) {
        System.out.printf("moved to %d and %d \n", x, y);
    }

    @Override
    public void paint() {
        System.out.printf("painting...");
    }
}
