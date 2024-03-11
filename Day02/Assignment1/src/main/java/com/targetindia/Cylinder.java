package com.targetindia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@AllArgsConstructor - maybe not
public class Cylinder extends Circle{
    private double height=1.0;

    public Cylinder(double radius){
        super(radius);
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public Cylinder(double radius, double height, String color){
        super(radius, color);
        this.height=height;
    }

    public double getVolume(){
        return height*super.getArea();
    }


}
