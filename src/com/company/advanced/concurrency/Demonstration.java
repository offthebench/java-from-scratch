package com.company.advanced.concurrency;

public class Demonstration {

    public static void main(String[] args) {
        try {
            SumUpExample.runTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
