package com.company.designpatterns.creational.abstractfactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOsCheckBox();
    }
}
