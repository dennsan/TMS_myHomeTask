package org.tms.lessons26.abstractfactory.Toyota;

import org.tms.lessons26.abstractfactory.Car;

public class CarToyota implements Car {
    @Override
    public void buildCar() {
        System.out.println("Build car Toyota");
    }
}
