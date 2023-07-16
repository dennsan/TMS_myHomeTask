package com.tms.lessons61;

public class Worker implements MajorService {
    String descWorker = "Java developer";
    @Override
    public void printable() {
        System.out.println(descWorker);
    }
}
