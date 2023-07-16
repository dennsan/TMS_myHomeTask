package com.tms.lessons6;

public class Rectangle extends Figure{
    public Rectangle(double width, double len){
        super(width,len);
    }
    @Override
    public double area() {
        return width*len;
    }

    @Override
    public double perimetr() {
        return (width+len)*2;
    }
}
