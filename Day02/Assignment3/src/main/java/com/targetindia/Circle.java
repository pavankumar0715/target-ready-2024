package com.targetindia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Circle extends Shape{
    private double radius=1.0;
    private static final double PI=3.14159265;

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    @Override
    public double getPerimeter() {
        return 2*PI*radius;
    }

    @Override
    public double getArea() {
        return PI*Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return "A Circle with radius="+radius+" , which is a subclass of "+ super.toString();
    }

}
