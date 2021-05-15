package com.company.advanced.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        Person person = new Person("Akshay", "Saxena");
        File file = new File("test.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(person.toString());
        } catch (IOException io) {
            System.out.println("IO exception occurred");
        }
    }

    //TODO: READ from the file.
}
