package com.company.advanced.inheritance.q1;

public class Animal {

    public void yieldVoice() {
    }

    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        Animal dog = new Dog();
        Animal cat = new Cat();
        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals) {
            animal.yieldVoice();
        }
    }
}
