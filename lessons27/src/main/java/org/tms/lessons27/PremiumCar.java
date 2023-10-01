package org.tms.lessons27;

public class PremiumCar extends CarDecorator{
    public PremiumCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding options Premium car");
    }
}
