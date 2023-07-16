package com.tms.lessons6;

public class Triangle extends Figure{
    private double height;
    private  double side_a;
    private double side_b;
    private double side_c;

    Triangle(double side_a, double side_b, double side_c, double height){
        this.height=height;
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }

    @Override
    public double area() {
        return (side_a*height)/2;
    }

    @Override
    public double perimetr() {
        return side_a+side_b+side_c;
    }
}
