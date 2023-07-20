package com.tms.lessons61;

public class Main {
    public static void main(String[] args) {
        MajorService majorDir = new Director();
        MajorService majorWorker = new Worker();
        MajorService majorBuh = new Buhgalter();
        majorDir.printable();
        majorWorker.printable();
        majorBuh.printable();
    }
}
