package com.company.advanced.interfaces;

public class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius;
    }

    @Override
    public void draw() {
        System.out.print("Print the circle for god sake!\n\n");
    }
}
