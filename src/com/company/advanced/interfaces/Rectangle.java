package com.company.advanced.interfaces;


public class Rectangle implements Shape {

    int length, width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.print(" is drawn.\n\n");
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle( 10, 12);
        rectangle.draw();
    }
}
