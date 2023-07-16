package com.tms.lessons61;

public class Buhgalter implements MajorService{

    String descBuh = "Chief buhgalter";
    @Override
    public void printable() {
        System.out.println(descBuh);
    }
}
