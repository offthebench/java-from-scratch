package com.company.designpatterns.creational.abstractfactory;

public class Client {


    public static Application configure() {
        Application app;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);

        return app;

    }

    public static void main(String[] args) {
        Application app = configure();
        app.paintButton();
        app.paintCheckBox();
    }
}
