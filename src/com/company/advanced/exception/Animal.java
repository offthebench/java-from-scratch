package com.company.advanced.exception;

public class Animal implements Comparable<Animal> {

    String type;

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public int compareTo(Animal animal) {
        return type.compareTo(animal.type);
    }
}
