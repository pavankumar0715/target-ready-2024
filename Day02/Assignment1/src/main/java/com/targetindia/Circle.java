package com.targetindia;
//import java.math.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle {
    private double radius=1.0;
    private String color="red";
    private static final double PI=3.14159265;//final else lombok will add getters and setters
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return PI*Math.pow(radius, radius);
    }

    @Override
    public String toString(){
        return "Circle[radius="+radius+",color="+color+"]";
    }


}
