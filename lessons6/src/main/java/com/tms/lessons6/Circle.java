package com.tms.lessons6;

public class Circle extends Figure {

    double radius;

    public Circle(double radius) {
       this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double perimetr() {
        return 2*Math.PI*radius;
    }
}
