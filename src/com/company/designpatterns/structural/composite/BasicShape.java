package com.company.designpatterns.structural.composite;

import java.awt.*;

public class BasicShape implements Shape {

    public int x;
    public int y;
    public Color color;
    public boolean selected = false;

    public BasicShape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public boolean isInBounds(int x, int y) {
        return x >getX() && x < (getX() + getWidth())
                && y > getY() && y <(getY() + getLength());
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            System.out.println("Shape selected");
        } else {
            System.out.println("Shape isn't selected");
        }
    }
}
