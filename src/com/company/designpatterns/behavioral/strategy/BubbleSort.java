package com.company.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class BubbleSort implements ISort {

    @Override
    public void sort(int[] input) {
        System.out.println("Running bubble sort");
        Arrays.sort(input);
    }
}
