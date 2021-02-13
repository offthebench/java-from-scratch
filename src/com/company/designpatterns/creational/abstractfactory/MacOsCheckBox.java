package com.company.designpatterns.creational.abstractfactory;

public class MacOsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is Mac OS CheckBox.");
    }
}
