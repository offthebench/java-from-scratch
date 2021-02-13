package com.company.designpatterns.structural.composite;

import java.awt.*;

public class Rectangle extends BasicShape {

    public int length;
    public int width;

    public Rectangle(int x, int y, int length, int width, Color color) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        System.out.println("rectangle is drawn");
    }
}
