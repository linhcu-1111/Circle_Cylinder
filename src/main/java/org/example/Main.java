package org.example;

public class Main {
//    public static void main(String[] args) {
//        Cylinder Cylinder = new Cylinder();
//        System.out.println(Cylinder);
//
//        Cylinder = new Cylinder(3.5);
//        System.out.println(Cylinder);
//        System.out.println("Chu vi " +Cylinder.getPerimeter());
//
//        Cylinder = new Cylinder(3.5,"indigo", false);
//        System.out.println(Cylinder);
//    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(3.5, 5);
        System.out.println(cylinder);
        System.out.println("Chu vi " +cylinder.getPerimeter());
        System.out.println("The tich " + cylinder.getVolume());

        cylinder = new Cylinder(3.5,2,"indigo", false);
        System.out.println(cylinder);
    }
}