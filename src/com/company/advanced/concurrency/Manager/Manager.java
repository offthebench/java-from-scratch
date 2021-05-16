package com.company.advanced.concurrency.Manager;

import java.util.ArrayList;

/*

    You are the manager. You have 5 employees. Simulate the situation in which each of
    them comes at a different time to work.
    a)
    Every employee, after getting to work, displays the information „„<name: I came
    to work at <time HH:
    b)
    Every 10 seconds, the employee displays name: I’m still working!
    c)
    Every 30 seconds, we release one of the employees to home (remember about
    stopping the thread!) a nd remove the employee from the active employees list
    d)
    When you release your employee to home, print „„<name: <time M M>, it's
    time to go home!
    e)
    e)* When you release a given employee, all of the others speed up . From that
    moment, display the information about work 2 seconds faster.
    f)
    The manager decides in which order release employees (e g through an
    earlier defined list)
 */
public class Manager {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Employee> employeeThreads = new ArrayList<>();

        int numOfEmployees = 5;
        for (int i = 0; i < numOfEmployees; i++) {
            Employee employee = new Employee("Emp" + i, System.currentTimeMillis());
            employeeThreads.add(employee);
        }



        while (true) {
            if (Thread.currentThread().isAlive()) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + ": I am Alive");
            }
        }
    }
}
