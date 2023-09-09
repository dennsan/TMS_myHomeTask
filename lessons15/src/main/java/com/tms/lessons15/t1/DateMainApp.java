package com.tms.lessons15.t1;

import java.time.LocalDate;
import java.util.Scanner;

public class DateMainApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year(YYYY):");
        int year = sc.nextInt();

        System.out.println("Enter month:");
        int month = sc.nextInt();

        System.out.println("Enter day:");
        int day = sc.nextInt();

        System.out.println("Enter date(YYYY-MM-DD):");
        String strDate = sc.next();

        LocalDate date = LocalDate.of(year, month, day);

        System.out.println(date.getDayOfWeek());

        LocalDate localDate = LocalDate.parse(strDate);

        System.out.println(localDate.getDayOfWeek());
    }
}
