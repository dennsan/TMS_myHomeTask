package org.tms.lessons27;

public class Main {
    public static void main(String[] args) {
     Car premiumCar = new PremiumCar(new StandartCar());
     premiumCar.assemble();
        System.out.println("\n--------------------------------");

     Car standartCar = new StandartCar();
     standartCar.assemble();
        System.out.println("\n--------------------------------");

     Car premiumSportCar = new SportCar(new PremiumCar(new StandartCar()));
     premiumSportCar.assemble();
    }
}