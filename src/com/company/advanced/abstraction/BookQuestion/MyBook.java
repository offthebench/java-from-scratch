package com.company.advanced.abstraction.BookQuestion;

public class MyBook extends Book {

    public MyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public void getDetails() {
        System.out.printf("The name of book: %s " +
                "\nThe Author: %s" +
                "\nThe Price: %d",
                super.name,
                super.author,
                super.price);
    }
}
