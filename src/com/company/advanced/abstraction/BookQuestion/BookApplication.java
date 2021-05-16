package com.company.advanced.abstraction.BookQuestion;

public class BookApplication {

    public static void main(String[] args) {
        MyBook myBook = new MyBook(
                "Winnie the pooh",
                "milne",
                23);

        myBook.getDetails();
    }
}
