package com.company.designpatterns.creational.factory;

public class WindowDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
