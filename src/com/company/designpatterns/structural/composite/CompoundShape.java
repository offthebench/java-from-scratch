package com.company.designpatterns.structural.composite;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompoundShape extends BasicShape {

    private List<Shape> children = new ArrayList<Shape>();

    public CompoundShape(Shape... shapes) {
        super(0, 0, Color.BLACK);
    }

    public void add(Shape component) {
        children.add(component);
    }

    public void add(Shape... components) {
        children.addAll(Arrays.asList(components));
    }

    public void remove(Shape component) {
        children.remove(component);
    }

    public void remove(Shape... components) {
        children.removeAll(Arrays.asList(components));
    }

    @Override
    public int getWidth() {
        for (Shape child : children) {
            //return maxHeight;
        }

        return 0;
    }

    @Override
    public int getLength() {
        for (Shape shape : children) {
            //return maxLength;
        }

        return 0;
    }

    @Override
    public boolean isInBounds(int x, int y) {
        for (Shape shape : children) {
            //check children;
        }
        return false;
    }


}
