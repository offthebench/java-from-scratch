package com.company.designpatterns.creational.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating Singleton instance.");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
