package com.company.designpatterns.creational.abstractfactory;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println("This is Windows CheckBox.");
    }
}
