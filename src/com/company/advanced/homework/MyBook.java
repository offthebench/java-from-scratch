package com.company.advanced.homework;

public class MyBook extends Book{

    public MyBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    protected void getDetails() {
        System.out.println(name + "\n" + author + "\n" + price + "EUR");
    }

    public static void main(String[] args) {
        MyBook myBook = new MyBook("Harry Potter", "J.K.Rowling", 20);
        myBook.getDetails();


    }
}
