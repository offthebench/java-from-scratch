package com.company.advanced.encapsulation;

public class Person {
    String name;
    int age;
    int height;
    int weight;
    String profession;

    public Person(String name, int age, int height, int weight, String profession) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.profession = profession;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
