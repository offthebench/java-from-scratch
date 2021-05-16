package com.company.advanced.concurrency.HelloWorld;

public class HelloWorldThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread 3 - Hello World "  + Thread.currentThread());
    }
}
