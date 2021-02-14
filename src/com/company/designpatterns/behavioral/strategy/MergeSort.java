package com.company.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class MergeSort implements ISort {
    @Override
    public void sort(int[] input) {
        System.out.println("Running merge sort");
        Arrays.sort(input);
    }
}
