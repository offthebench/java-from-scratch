package com.company.advanced.homework;

public class MyBook extends Book{

    public MyBook(String name, String author, double price) {
        super(name, author, price);
    }

    @Override
    protected void getDetails() {
        System.out.println(name + "\n" + author + "\n" + price + "EUR");
    }


}
