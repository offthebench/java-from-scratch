package com.company.designpatterns.creational.factory;

public class HtmlButton implements Button {

    @Override
    public void paint() {
        System.out.println("This is a Html Button");
    }
}
