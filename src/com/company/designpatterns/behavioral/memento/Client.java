package com.company.designpatterns.behavioral.memento;

import java.io.IOException;

public class Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BlackBox blackBox = new BlackBox(10000, 900, 90);
        byte[] memento = blackBox.getState();
        System.out.println(blackBox.getState().length);
        blackBox = blackBox.setState(memento);
        System.out.println(blackBox.getAltitude());
        System.out.println(blackBox.getState());

    }
}
