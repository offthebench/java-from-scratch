package com.company.designpatterns.creational.factory;

public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("This is a mac button");
    }
}
