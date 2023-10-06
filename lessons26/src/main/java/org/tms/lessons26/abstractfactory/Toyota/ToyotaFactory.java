package org.tms.lessons26.abstractfactory.Toyota;

import org.tms.lessons26.abstractfactory.AbstractFactory;
import org.tms.lessons26.abstractfactory.Bike;
import org.tms.lessons26.abstractfactory.Car;
import org.tms.lessons26.abstractfactory.Honda.BikeHonda;
import org.tms.lessons26.abstractfactory.Honda.CarHonda;
import org.tms.lessons26.abstractfactory.Honda.MotoHonda;
import org.tms.lessons26.abstractfactory.Moto;

public class ToyotaFactory implements AbstractFactory {
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
