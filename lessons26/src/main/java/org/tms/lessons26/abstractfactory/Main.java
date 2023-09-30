package org.tms.lessons26.abstractfactory;

import org.tms.lessons26.abstractfactory.Honda.HondaFactory;
import org.tms.lessons26.abstractfactory.Toyota.ToyotaFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new HondaFactory();
        Car car = abstractFactory.getCar();
        Moto moto = abstractFactory.getMoto();
        Bike bike = abstractFactory.getBike();
        car.buildCar();
        moto.buildMoto();
        bike.buildBike();

        System.out.println("######################################################");

        AbstractFactory abstractFactory1 = new ToyotaFactory();
        Car car1 = abstractFactory1.getCar();
        Moto moto1 = abstractFactory1.getMoto();
        Bike bike1 = abstractFactory1.getBike();
        car1.buildCar();
        moto1.buildMoto();
        bike1.buildBike();
    }
}