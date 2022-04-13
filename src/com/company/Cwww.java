package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Cwww {
    public static void main(String[] args) {

//        File myfile = new File("Demofile.txt");
//        try {
//            myfile.createNewFile();
//        } catch (IOException e) {
//            System.out.println("Unable to create the file");
//            e.printStackTrace();
    }

    FileWriter fileWriter;

    {
        try {
            FileWriter fileWriter = new FileWriter("Demofile.txt");
            fileWriter.write("these is my first file");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
