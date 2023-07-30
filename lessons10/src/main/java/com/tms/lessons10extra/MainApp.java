package com.tms.lessons10extra;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter path:");
            String pathFile = sc.next();
            try {
                LineNumberReader reader = new LineNumberReader(new FileReader(pathFile));

                OutputStream validWriter = new FileOutputStream("C:\\Users\\Kim\\validDoc.txt", true);

                OutputStream notValidWriter = new FileOutputStream("C:\\Users\\Kim\\notValidDoc.txt",true);

                String read = reader.readLine();

                while (read != null) {

                    if (read != null && read.length() == 15 && (read.startsWith("docnum") || read.startsWith("contract"))) {
                        System.out.println("Document is valid");
                        char [] val = read.toCharArray();
                        for (char ch : val){
                        validWriter.write(ch);

                        }

                        validWriter.write('\n');

                    } else {
                        char [] val = read.toCharArray();
                        for (char ch : val){
                            notValidWriter.write(ch);
                        }

                        notValidWriter.write('\n');

                        System.out.println("Document is not valid");
                    }

                    read = reader.readLine();
                }
            } catch (Exception ex) {

                System.out.println("Error");
            }
        }
   }
