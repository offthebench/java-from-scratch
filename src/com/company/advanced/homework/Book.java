package com.company.advanced.homework;

public abstract class Book {
    protected String name;
    protected String author;
    protected double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    protected abstract void getDetails();
}
