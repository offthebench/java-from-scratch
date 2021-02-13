package com.company.designpatterns.creational.abstractfactory;

public class Application {

    private Button button;
    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paintButton() {
        button.paint();
    }

    public void paintCheckBox() {
        checkBox.paint();
    }
}
