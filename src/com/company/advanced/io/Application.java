package com.company.advanced.io;

import java.io.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Person person = new Person("Akshay", "Saxena");
        File file = new File("test.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write(String.valueOf(person));
        } catch (IOException io) {
            System.out.println("IO exception occurred");
        }

        try {
            File myFile = new File("test.txt");
            Scanner readFromFile = new Scanner(myFile);
            while (readFromFile.hasNextLine()) {
                String line = readFromFile.nextLine();
                System.out.println(line);
            }
            readFromFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    //TODO: READ from the file.
}
