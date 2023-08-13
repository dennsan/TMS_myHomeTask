package com.tms.lessons11;


public class MainApp {
    public static void main(String[] args) {
        MyArrayList<Integer> num = new MyArrayList<>();

        num.add(1);
        num.add(2);
        num.add(3);
        num.add(2);
        num.add(2);
        num.delete(2);
        num.indexEl(1);
        num.searchEl(2);
        num.clear();

        num.print();

    }
}
