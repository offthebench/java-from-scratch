package com.company.designpatterns.structural.compositePartTwo;

public class SalesDepartment implements Department {

    private int id;
    private String name;


    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
