package com.company.advanced.concurrency.HelloWorld;

public class HelloWorld {

    public static void main(String[] args) {
        //Method 1
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1 - Hello World " + Thread.currentThread());
            }
        });

        t1.start();
        System.out.println(t1.getThreadGroup());

        //Method 2
        Thread t2 = new Thread(new HelloWorldRunnable());
        t2.start();

        //Method 3
        HelloWorldThread helloWorldThread = new HelloWorldThread();
        helloWorldThread.start();
    }
}
