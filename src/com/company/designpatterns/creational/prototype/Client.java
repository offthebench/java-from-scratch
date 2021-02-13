package com.company.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.radius = 15;
        circle.x = 0;
        circle.y = 0;
        circle.color = "yellow";
        shapes.add(circle);

        Circle circleCopy = (Circle) circle.clone();
        shapes.add(circleCopy);

        Square square = new Square();
        square.height = 5;
        square.width = 5;
        square.x = 10;
        square.y = 10;
        square.color = "red";
        shapes.add(square);

        cloneAndCompare(shapes, shapesCopy);
    }

    public static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape);
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println("Shapes are different");
            }
        }
    }
}
