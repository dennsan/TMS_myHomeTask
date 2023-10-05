package org.tms.lessons27;

public class SportCar extends CarDecorator{
    public SportCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding options Sport car");
    }
}
