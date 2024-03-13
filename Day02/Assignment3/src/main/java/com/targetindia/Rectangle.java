package com.targetindia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rectangle extends Shape{
//    protected double width =1.0, length=1.0;

    private double width =1.0, length=1.0;


    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString(){
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of"+super.toString();
    }
}
