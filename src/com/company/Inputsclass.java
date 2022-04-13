package com.company;

import java.io.*;
import java.util.Scanner;

public class Inputsclass {

    public static void main(String[] args) {

        //  System.out.println("Taking Inputs from the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number 1");
        int a = sc.nextInt();
        //  System.out.println("Enter the second number 2");
        //  int b = sc.nextInt();

        // int sum = a + b;
        System.out.println("The sum of these number is");
        System.out.println(a);

        try {
            FileOutputStream output = new FileOutputStream("C://Users//insthak//IdeaProjects//Sort//Demofile.txt");
            BufferedWriter fileWriter = new BufferedWriter(new OutputStreamWriter(output));

            for (int i = 1; i <= a; i++) {

                for (int j = 1; j <= i; j++) {
                    //           System.out.print("*");
                    fileWriter.write("*");
                }
                System.out.println(" ");
                fileWriter.newLine();

            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}