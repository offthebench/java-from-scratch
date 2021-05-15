package com.company.advanced.abstraction;

public class Rectangle extends Shape {

    int length, width;

    Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.print(super.objectName + " is drawn.\n\n");
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle1", 10, 12);
        rectangle.draw();
        rectangle.moveTo(12, 12);
    }
}
