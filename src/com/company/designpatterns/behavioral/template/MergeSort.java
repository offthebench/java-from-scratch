package com.company.designpatterns.behavioral.template;

public class MergeSort extends ISort {

    @Override
    void sort(int[] input) {
        System.out.println("Overridden method called, Merge sort executing");
    }
}
