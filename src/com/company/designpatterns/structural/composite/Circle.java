package com.company.designpatterns.structural.composite;

import java.awt.*;

public class Circle extends BasicShape {

    public int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public int getLength() {
        return radius * 2;
    }

    @Override
    public int getWidth() {
        return radius * 2;
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        System.out.println("Circle is drawn");
    }
}
