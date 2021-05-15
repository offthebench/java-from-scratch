package com.company.advanced.abstraction;

public class Circle extends Shape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
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
