package com.tms.lessons9;

import java.util.Scanner;

public class PrintSearch {

    //Вывести на экран номер документа, но блоки из трех букв заменить
    //на *** (каждая буква заменятся на *).
    public static void replaceN(String numDoc) {
        String replace = numDoc;
        System.out.println(numDoc);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count correct:");
        int count = sc.nextInt();

        do {
            System.out.println("Enter word for correct:");
            String find = sc.next();
            replace = replace.replace(find, "***");
            count--;
        } while (count != 0);

        System.out.println("Corrected \n" + replace);
    }


//    Вывести на экран в одну строку два первых блока по 4 цифры.
    public static void PrintN(String numDoc) {

        int index = numDoc.indexOf('-');
        int index1 = numDoc.indexOf('-', index + 1);
        String substring = numDoc.substring(0, index);
        String substring1 = numDoc.substring(index1 + 1, index1 + 5);
        System.out.println(substring + substring1);

    }

    // Вывести на экран только одни буквы из номера документа в формате
    //yyy/yyy/y/y в нижнем регистре.

    public static void printA(String numDoc) {

        char[] chr = numDoc.toCharArray();
        char[] ch = new char[chr.length];

        for (int j = 0; j < chr.length; j++) {
            if (Character.isLetter(chr[j])) {
                ch[j] = chr[j];
            } else {
                ch[j] = ' ';
            }
        }

        String str = String.copyValueOf(ch);
        String str1 = str.trim();
        String lowerCase = str1.toLowerCase();
        String[] split = lowerCase.split(" ");

        for (String strAr : split) {
            if (strAr != "") {
                System.out.print(String.format("%s/", strAr));
            }
        }
    }


    //Проверить содержит ли номер документа последовательность abc и
    //вывети сообщение содержит или нет(причем, abc и ABC считается
    //одинаковой последовательностью).
    public static void checkA(String numDoc) {

        String str = "ABC";

        String numDocLowerCase = numDoc.toLowerCase();
        String strLowerCase = str.toLowerCase();

        boolean contains = numDocLowerCase.contains(strLowerCase);


        if (contains) {
            System.out.println("Contains");
        } else {
            System.out.println("Not contains");
        }

    }


    //Вывести на экран буквы из номера документа в формате
    //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
    //класса StringBuilder).
    public static void printStringB(String numDoc) {

        char[] chr = numDoc.toCharArray();
        char[] ch = new char[chr.length];

        for (int j = 0; j < chr.length; j++) {
            if (Character.isLetter(chr[j])) {
                ch[j] = chr[j];
            } else {
                ch[j] = ' ';
            }
        }

        String str = String.copyValueOf(ch);
        String str1 = str.trim();
        String lowerCase = str1.toLowerCase();
        String[] split = lowerCase.split(" ");
        StringBuilder builder = new StringBuilder();


        for (String strAr : split) {
            if (strAr != "") {
                builder.append(strAr);
                builder.append("/");
            }
        }
        String result = builder.toString();
        String resultUpperCase = result.toUpperCase();
        System.out.println("Letters:" + resultUpperCase);
    }


    //Проверить начинается ли номер документа с последовательности
    //555.
    public static void searchNumDoc(String num){

        String searchNum = "555";
        boolean startNum = num.startsWith(searchNum);

        if (startNum){
            System.out.println("Start with " + searchNum);
        }else {
            System.out.println("Not start with " + searchNum);
        }

    }


    //Проверить заканчивается ли номер документа на
    //последовательность 1a2b.
    public static void searchEndNum(String num){
        String searchNum = "1a2b";
        boolean endsWith = num.endsWith(searchNum);
        if (endsWith){
            System.out.println("End document " + searchNum);
        }else {
            System.out.println("End document not " + searchNum);
        }
    }
}
