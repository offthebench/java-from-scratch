package com.company.advanced.encapsulation;

public class Rectangle {

    // Write Fields Here
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {

        // Write your code here
        this.length = length;
        this.width = width;

    }

    public int getArea() {
        return this.length * this.width;
    }
}
