package com.tms.lessons10;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter path:");
        String pathFile = sc.next();
        try {
            LineNumberReader reader = new LineNumberReader(new FileReader(pathFile));

            String read = reader.readLine();

            while (read != null) {

                if (read.length() == 15 && (read.startsWith("docnum") || read.startsWith("contract"))) {
                    System.out.println("Document is valid");
                } else {
                    System.out.println("Document is not valid");
                }

                read = reader.readLine();
            }
        } catch (Exception ex) {

            System.out.println("Error");
        }
    }
}
