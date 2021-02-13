package com.company.designpatterns.creational.abstractfactory;

public class MacOsButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is a macOS Button");
    }
}
