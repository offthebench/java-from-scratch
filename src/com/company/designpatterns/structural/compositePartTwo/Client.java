package com.company.designpatterns.structural.compositePartTwo;

public class Client {
    public static void main(String[] args) {
        Department tech = new TechDepartment();
        Department sales = new SalesDepartment();

        HeadDepartment headDepartment = new HeadDepartment(3, "head office");

        headDepartment.addDepartment(sales);
        headDepartment.addDepartment(tech);

        headDepartment.removeDepartment(sales);

        headDepartment.printDepartmentName();
    }
}
