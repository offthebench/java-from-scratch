package com.company.advanced.io;

import java.io.*;

public class Application {

    public static void main(String[] args) {
        File file = new File("test.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) !=null) {
                System.out.println(fileLine);
            }
        } catch (IOException io) {
            System.out.println("IO exception occurred");
        }
    }

    //TODO: READ from the file.
}
