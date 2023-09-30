package org.tms.lessons26.abstractfactory.Honda;

import org.tms.lessons26.abstractfactory.AbstractFactory;
import org.tms.lessons26.abstractfactory.Bike;
import org.tms.lessons26.abstractfactory.Car;
import org.tms.lessons26.abstractfactory.Moto;

public class HondaFactory implements AbstractFactory {
    @Override
    public Car getCar() {
        return new CarHonda();
    }

    @Override
    public Moto getMoto() {
        return new MotoHonda();
    }

    @Override
    public Bike getBike() {
        return new BikeHonda();
    }
}
