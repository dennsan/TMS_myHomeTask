package com.tms.lessons7;

public class MyApp {
    public static void main(String[] args) {

        Phone phone1 = new Phone(123456878, "Nokia", 40);
        Phone phone2 = new Phone(456789123, "Samsung");
        Phone phone3 = new Phone();

        System.out.println(" ");

        phone1.infoPhone();
        phone2.infoPhone();
        phone3.infoPhone();

        System.out.println(" ");

        phone1.receiveCall("Vasya");
        phone2.receiveCall("Olga");
        phone3.receiveCall("Helga");

        int phone1Number = phone1.getNumber();
        System.out.println(phone1Number);
        int phone2Number = phone2.getNumber();
        System.out.println(phone2Number);
        int phone3Number = phone3.getNumber();
        System.out.println(phone3Number);

        System.out.println(" ");

        phone1.receiveCall("Vasya", phone1);
        phone2.receiveCall("Sonya", 78954321);

        System.out.println(" ");

        Phone[] phones = new Phone[]{phone1, phone2, phone3};
        Phone.sendMessage(phones);

    }
}
