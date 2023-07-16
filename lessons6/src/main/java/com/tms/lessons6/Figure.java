package com.tms.lessons6;

abstract class Figure
{
    double width;
    double len;

    public Figure(double width, double len) {
        this.width = width;
        this.len = len;
    }

    Figure() {
    }

    public abstract double area();
    public abstract double perimetr();
}
