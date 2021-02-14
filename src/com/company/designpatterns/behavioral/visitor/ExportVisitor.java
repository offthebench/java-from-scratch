package com.company.designpatterns.behavioral.visitor;

public class ExportVisitor implements Visitor {

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Export Circle data to file");
    }
}
