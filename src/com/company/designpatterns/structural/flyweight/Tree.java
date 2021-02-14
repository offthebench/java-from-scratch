package com.company.designpatterns.structural.flyweight;

import java.awt.*;

public class Tree {
    public int x;
    public int y;
    private TreeType treeType;

    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }

    public void draw(Graphics graphics) {
        treeType.draw(graphics, x, y);
    }
}
