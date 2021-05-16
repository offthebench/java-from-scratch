package com.company.advanced.concurrency;
/*
  | |
  | |
  | |
  | |
  | |
  | |
 */
public class Application {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(thread.getPriority());
    }
}
