package com.company.advanced.encapsulation.q1;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Alsasian", 4D);
        System.out.println(dog.getWeight());
        System.out.println(dog.getAge());

        dog.setWeight(10);
        dog.setAge(2);

        System.out.println(dog.getWeight());
        System.out.println(dog.getAge());
    }
}
