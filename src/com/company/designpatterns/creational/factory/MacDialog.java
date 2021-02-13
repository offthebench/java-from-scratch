package com.company.designpatterns.creational.factory;

public class MacDialog extends Dialog {
    @Override
    public Button createButton() {
        return new MacButton();
    }
}
