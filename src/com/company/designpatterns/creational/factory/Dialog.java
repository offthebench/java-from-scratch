package com.company.designpatterns.creational.factory;

public abstract class Dialog {

    public void renderWindow() {
        Button button = createButton();
        button.paint();
    }


    public  abstract Button createButton();
}
