package com.company.designpatterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        MergeSort mergeSort = new MergeSort();
        Context context = new Context(mergeSort);
        context.sort(numbers);
    }
}
