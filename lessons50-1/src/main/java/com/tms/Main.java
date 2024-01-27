package com.tms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        Search search = new Search();
        Integer index = search.searchPattern(text, pattern);
        System.out.println(index);
    }
}