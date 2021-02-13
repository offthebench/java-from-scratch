package com.company.designpatterns.structural.decorator;

public class Client {

    public static void main(String[] args) {
        String todaysClass = "Today We learned about Design Patterns in Java, and maybe understood too!";

        DataSourceDecorator encoded = new EncryptionDecorator(new FileDataResource("out/OutPutDemo.txt"));

        encoded.writeData(todaysClass);
        DataSource plain = new FileDataResource("out/OutPutDemo.txt");


        System.out.println("----");
        System.out.println(todaysClass);
        System.out.println("----");
        System.out.println(encoded.readData());
        System.out.println("----");
        System.out.println(plain.readData());
    }
}
