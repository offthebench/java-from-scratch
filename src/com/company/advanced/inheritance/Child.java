package com.company.advanced.inheritance;

public class Child extends Family {

    private String firstName;
    private int money;

    public Child(String firstName, String lastName, int money) {
        super(lastName);
        this.firstName = firstName;
        this.money = money;
    }
}
