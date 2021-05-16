package com.company.advanced.concurrency.ThreadUnsafe;

public class ThreadUnsafeCounter {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    void printFinalCounterValue() {
        System.out.println("counter is: " + count);
    }
}
