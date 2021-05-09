package com.company.designpatterns.behavioral.strategy;

public class Client {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        BubbleSort bubbleSort = new BubbleSort();
        Context context = new Context(bubbleSort);
        context.sort(numbers);
    }
}
