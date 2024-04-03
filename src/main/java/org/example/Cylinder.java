package org.example;

public class Cylinder extends Circle{
    double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.height = height;
    }

    public double getHeigt() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height * super.getArea();
    }

    @Override
    public double getPerimeter() {
        return height * super.getPerimeter();
    }
}
