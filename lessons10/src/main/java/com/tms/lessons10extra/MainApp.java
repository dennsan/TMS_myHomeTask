package com.tms.lessons10extra;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path:");
        String pathName = sc.next(); // text.txt

        try {

            LineNumberReader reader = new LineNumberReader(new FileReader(pathName));
            FileWriter validWriter = new FileWriter("validDoc.txt");
            FileWriter notValidWriter = new FileWriter("notValidDoc.txt");
            String read;

            while ((read = reader.readLine()) != null) {
                if (read.length() == 15 && (read.startsWith("docnum") || read.startsWith("contract"))) {
                    validWriter.write(read + "\n");
                    System.out.println("Document is valid");
                } else if (read.length() != 15) {
                    notValidWriter.write(read + " Length number is not valid\n");
                    System.out.println("Document is not valid");
                } else if (!(read.startsWith("docnum") || read.startsWith("contract"))) {
                    notValidWriter.write(read + " Doc name is not valid\n");
                    System.out.println("Document is not valid");
                }
            }

            reader.close();
            validWriter.close();
            notValidWriter.close();

        } catch (Exception exp) {
            System.out.println("Error");
        }

    }
}