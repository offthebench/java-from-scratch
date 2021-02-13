package com.company.designpatterns.creational.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is a Windows Button");
    }
}
