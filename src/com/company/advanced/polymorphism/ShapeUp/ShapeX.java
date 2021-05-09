package com.company.advanced.polymorphism.ShapeUp;

public class ShapeX extends Shape {

    private String name;

    public ShapeX(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name + " " + super.getName();
    }
}
