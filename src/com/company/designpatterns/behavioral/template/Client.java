package com.company.designpatterns.behavioral.template;

public class Client {

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        MergeSort mergeSort = new MergeSort();
        DefaultSort defaultSort = new DefaultSort();
        Context context = new Context(defaultSort);
        context.sort(numbers);

        context.setHowToSort(mergeSort);
        context.sort(numbers);
    }
}
