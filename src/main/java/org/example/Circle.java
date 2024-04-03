package org.example;

public class Circle {

    double radius = 1.0;
    String color = "white";
    boolean filled = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled (boolean filled) {
        this.filled = filled;
    }

    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "mau sac " + color
                + " ban kinh " + radius;
    }

}
