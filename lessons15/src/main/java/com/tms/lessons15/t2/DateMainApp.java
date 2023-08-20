package com.tms.lessons15.t2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateMainApp {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
//        LocalDate localDate = LocalDate.of(2023, 8, 8);

        if (localDate.getDayOfWeek() == DayOfWeek.TUESDAY) {

            localDate = localDate.plusDays(1);

            while (localDate.getDayOfWeek() != DayOfWeek.TUESDAY) {

                localDate = localDate.plusDays(1);

            }
        } else {

            while (localDate.getDayOfWeek() != DayOfWeek.TUESDAY) {

                localDate = localDate.plusDays(1);

            }
        }

        System.out.println("Date next tuesday is: " + localDate);

    }
}
