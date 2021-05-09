package com.company.advanced.encapsulation.q1;

/*
    -a) Add private fields to the class, like name, age, gender, race, weigth.
    -b) Create constructor that accepts all of the class fields.
    -c) Create additional constructor, that will accept only gender and race.
        It should call main constructor with default values.
    -d) Create getters and setters for age and weigth.
    -e) Create object of class Dog. Verify if everything works as expected.
    -f) Add verification for all arguments passed to the setters.
    E.g. setWeight method should
    not accept values below or equal to 0.
 */
public class Dog {

    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.race = race;
        this.weight = weight;
    }

    public Dog(String race, double weight) {
        new Dog("Dog", 0, "Neutral", race, weight);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be less than or equal to 0");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight cannot be less than or equal to 0");
        }
    }
}
