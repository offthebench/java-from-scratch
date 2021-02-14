package com.company.designpatterns.behavioral.iterator;

public interface Iterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
