package com.company.designpatterns.creational.factory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.print("This is a Windows Button");
    }
}
