package com.company.advanced.recursion;

public class Factorial {

    public static void calculateFactorial(int i) {
        long factorial = i;
        while (i > 1) {
            i -= 1;
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        calculateFactorial(50);
        long end = System.currentTimeMillis();


        long start2 = System.currentTimeMillis();
        long fact = calculateFactorialRecursive(50);
        System.out.println(fact);
        long end2 = System.currentTimeMillis();



        System.out.printf("\nTime taken Iteratively: %d\n", end - start);
        System.out.printf("\nTime taken Recursive: %d\n", end2 - start2);
    }
    public static long calculateFactorialRecursive(int i) {
        if (i <= 1) {
            return 1;
        }
        return calculateFactorialRecursive(i - 1) * i;
    }
}
