package com.company.designpatterns.creational.factory;

public class Client {

    private static Dialog dialog;

    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("mac")) {
            dialog = new MacDialog();
        } else {
            dialog = new HtmlDialog();
        }


        dialog.renderWindow();
    }
}
