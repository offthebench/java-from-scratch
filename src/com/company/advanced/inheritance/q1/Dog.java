package com.company.advanced.inheritance.q1;

/*
    Create classes Dog and Cat.
    -a) Move common methods and fields to the class Animal.
    -b) Create method „yieldVoice”.
    -c) Create simple array of type Animal, that will contain one object of type Dog and
    one object of type Cat.
    -d) Using for-each loop show which animal gives what kind of voice. How to print a
    name of an object?
 */
public class Dog extends Animal {

    @Override
    public void yieldVoice() {
        System.out.println("Barks");
    }
}
