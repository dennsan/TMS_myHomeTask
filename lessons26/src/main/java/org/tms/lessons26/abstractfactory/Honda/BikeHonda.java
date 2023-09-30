package org.tms.lessons26.abstractfactory.Honda;

import org.tms.lessons26.abstractfactory.Bike;

public class BikeHonda implements Bike {
    @Override
    public void buildBike() {
        System.out.println("Build bike Honda");
    }
}
