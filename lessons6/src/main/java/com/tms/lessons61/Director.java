package com.tms.lessons61;

public class Director implements MajorService {

    String desc_dir = "General director";

    @Override
    public void printable() {
        System.out.println(desc_dir);
    }

}
