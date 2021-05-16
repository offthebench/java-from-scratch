package com.company.advanced.lambdas;

public class Maths implements AddInterface{

    int x;
    int y;

    AddInterface addInterface;

    public Maths(AddInterface addInterface) {
        this.addInterface = addInterface;
    }

    @Override
    public void add(int x, int y) {
        System.out.println(x + y);
    }

    @Override
    public void subtract() {
        System.out.println("Subtraction");
    }
}
