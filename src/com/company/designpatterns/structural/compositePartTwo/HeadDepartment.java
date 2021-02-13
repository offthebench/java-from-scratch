package com.company.designpatterns.structural.compositePartTwo;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {

    private int id;
    private String name;

    private List<Department> children;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.children = new ArrayList<>();
    }

    @Override
    public void printDepartmentName() {
        children.forEach(Department::printDepartmentName);
    }

    public void addDepartment(Department department) {
        children.add(department);
    }

    public void removeDepartment(Department department) {
        children.remove(department);
    }
}
