package org.tms.lessons26.abstractfactory.Toyota;

import org.tms.lessons26.abstractfactory.Bike;

public class BikeToyota implements Bike {
    @Override
    public void buildBike() {
        System.out.println("Build bike Toyota");
    }
}
