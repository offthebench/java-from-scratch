package com.company.advanced.recursion;

public class Fibonacci {

    //0,1,1,2,3,5,8,13

    //iterative Method
    public static int calculateFibonacciIteratively(int num) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        for (int i = 2; i <= num; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }

    //recursive Method
    public static int calculateFibonacciRecursively(int num) {
        if (num <= 1) {
            return num;
        } else {
            return (calculateFibonacciRecursively(num - 1)
                    + calculateFibonacciRecursively(num - 2));
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateFibonacciIteratively(7));
        System.out.println(calculateFibonacciRecursively(7));
    }
}
