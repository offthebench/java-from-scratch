package com.company.advanced;

/*
     %s - string
     %d - int/long
     %f - float/double


     ShapeX, shape
 */

import com.company.advanced.polymorphism.ShapeUp.ShapeX;

public class Application {

    public static void main(String[] args) {
        ShapeX shapeX = new ShapeX("ShapeX");
        System.out.println(shapeX.getName());

    }
}
