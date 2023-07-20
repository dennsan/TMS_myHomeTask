package com.tms.lessons6;

public class MainApp {
    public static void main(String[] args) {
        Figure triangle = new Triangle(2,4,6,5);
        Figure rectangle = new Rectangle(10,14);
        Figure circle = new Circle(23);
        Figure rectangle1 = new Rectangle(5,11);
        Figure circle1 = new Circle(12);
        double sum = 0;
        Figure[] figure;
        figure = new Figure[]{triangle, rectangle,circle,rectangle1,circle1};
        for(int i=0; i< figure.length; i++){
            double per = figure[i].perimetr();
            sum += per;
        }
        System.out.println(sum);
    }
}
