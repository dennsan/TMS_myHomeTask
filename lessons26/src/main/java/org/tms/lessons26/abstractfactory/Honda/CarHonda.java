package org.tms.lessons26.abstractfactory.Honda;

import org.tms.lessons26.abstractfactory.Car;

public class CarHonda implements Car {
    @Override
    public void buildCar() {
        System.out.println("Build car Honda");
    }
}
