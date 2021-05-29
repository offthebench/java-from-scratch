package com.company.advanced.recursion;

public class Counter {

    //Iterative
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    //Recursive
    public static int countDigitsRecursive(int i) {
        if (i == 0) {
            return 0;
        }
        return 1 + countDigitsRecursive(i / 10);
    }

    //main
    public static void main(String[] args) {

        int input = 1435043;
        int numDigits = countDigits(input);
        System.out.println("Number of digits in " + input + " = " + numDigits);


        long start1 = System.currentTimeMillis();
        int numDigitsRecur = countDigitsRecursive(input);
        long end1 = System.currentTimeMillis();
        System.out.println("Number of digits in " + input + " = " + numDigitsRecur);



    }
}
