package com.company.advanced.concurrency.HelloWorld;

public class HelloWorldRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2 - Hello World "  + Thread.currentThread());
    }
}
