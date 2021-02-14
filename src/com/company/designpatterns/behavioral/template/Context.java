package com.company.designpatterns.behavioral.template;

public class Context {

    private ISort howToSort;

    public Context(ISort howToSort) {
        this.howToSort = howToSort;
    }

    void sort(int[] nums) {
        howToSort.sort(nums);
    }

    public void setHowToSort(ISort howToSort) {
        this.howToSort = howToSort;
    }
}
