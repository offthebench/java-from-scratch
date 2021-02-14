package com.company.designpatterns.behavioral.interprator;


public class Client {

    public static void main(String[] args) {
        Context context = new Context("glide splits glide barellroll glide");

        String[] strings = context.getValue().split(" ");

        for (String s : strings) {

        }
    }
}
