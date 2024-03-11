package com.targetindia;

public class Program {
    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");

            Circle[] circles={
                    new Cylinder(12.43),
                    new Cylinder(12.34, 10.0),
                    new Cylinder(12.34, 10, "bllue")
            };

            for(Circle circle: circles){
                System.out.println("Area: "+ circle.getArea()+" Volume: "+((Cylinder)circle).getVolume());
        }
    }
}