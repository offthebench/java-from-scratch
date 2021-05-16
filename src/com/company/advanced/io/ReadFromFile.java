package com.company.advanced.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File readFile = new File("test.txt");
            Scanner scanner = new Scanner(readFile);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
