package com.company.designpatterns.structural.flyweight;

import java.awt.*;

public class Client {

    static int CANVAS_SIZE = 500;
    static int TREES_TO_DRAW = 10000;
    static int TREE_TYPES = 2;

    public static void main(String[] args) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor(TREES_TO_DRAW/TREE_TYPES); i++) {
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Fern", Color.GREEN, "Winters Tree");
            forest.plantTree(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Oak", Color.GRAY, "Summer Tree");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setVisible(true);
    }


    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
