package com.company.advanced.recursion;

public class StringReverse {

    public static String reverseIteratively(String input) {
        StringBuilder builder = new StringBuilder();
        for (int i = input.length()-1 ; i > 0; i--) {
            builder.append(input.charAt(i));
        }

        return builder.toString();
    }

    //Akshay
    //kshay + A
    //shay + k
    //hay + s
    //ay + h
    //y + a
    //ya
    //yah
    //yahs
    //yahsk
    //yahskA


    //(((((y + a) + h) + s) + k) + A) = yahskA

    public static String reverseRecursively(String input) {
        if (input.isEmpty()) {
            return input;
        }

        return reverseRecursively(input.substring(1)) + input.charAt(0);
    }

    public static void main(String[] args) {
        String name = "Akshay";
        System.out.println(reverseIteratively(name));
        System.out.println(reverseRecursively(name));
    }
}
