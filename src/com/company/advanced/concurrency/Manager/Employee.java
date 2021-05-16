package com.company.advanced.concurrency.Manager;

public class Employee {

    String name;
    long startTimeAtWork;

    public Employee(String name, long startTimeAtWork) {
        this.name = name;
        this.startTimeAtWork = startTimeAtWork;
        System.out.printf("%s: I came to work at %s\n\n", name, startTimeAtWork);
    }

    public void isAlive() {
        System.out.println(name + " I am Alive");
    }

    public void bye() {
        System.out.println(name + " Time to leave");
    }

}
