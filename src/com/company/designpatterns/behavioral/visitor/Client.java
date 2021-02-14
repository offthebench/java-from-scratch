package com.company.designpatterns.behavioral.visitor;

public class Client {

    public static void main(String[] args) {
        Circle circle = new Circle(5);

        ExportVisitor  exportVisitor = new ExportVisitor();
        exportVisitor.visitCircle(circle);
    }
}
