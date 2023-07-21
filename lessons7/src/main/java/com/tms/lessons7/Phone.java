package com.tms.lessons7;

public class Phone {

    int number;
    String model;
    int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
        model = "Iphone";
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    static void sendMessage(Phone... phoneNum) {
        for (int i = 0; i < phoneNum.length; i++) {
            System.out.println(phoneNum[i].number);
        }
    }

    int getNumber() {
        return number;
    }
    // Здесь так потомучто ругается IDEA

//    public Phone(int number, String model, int weight) {
//        this.number = number;
//        this.model = model;
//        this.weight = weight;
//    }

    void receiveCall(String nameCaller) {
        System.out.println("Звонит " + nameCaller);
    }

    // не знал как тут делать так
    void receiveCall(String nameCaller, Phone phone) {
        System.out.println("Звонит " + nameCaller + " " + phone.getNumber());
    }

    // или так
    void receiveCall(String nameCaller, int number) {
        System.out.println("Звонит " + nameCaller + " " + number);
    }

    void infoPhone() {
        if (number != 0 && model != null && weight != 0) {
            System.out.println(number + " " + model + " " + weight + "g");
        } else if (number == 0 && model != null && weight != 0) {
            System.out.println(model + " " + weight + "g");
        } else if (number != 0 && model == null && weight != 0) {
            System.out.println(number + " " + weight + "g");
        } else if (number != 0 && model != null && weight == 0) {
            System.out.println(number + " " + model);
        } else {
            System.out.println(model);
        }
    }
}
