package com.company.designpatterns.structural.composite;

import java.awt.*;

public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getLength();
    void move(int x, int y);
    boolean isInBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
