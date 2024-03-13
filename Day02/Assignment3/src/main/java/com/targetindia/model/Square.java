package com.targetindia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Square extends Rectangle{
    private double side=1.0;

    public Square(){
        super.setWidth(side);
        super.setLength(side);
    }

    public Square(double side){
        super.setWidth(side);
        super.setLength(side);
        this.side=side;
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
        this.side=side;
    }

    @Override
    public String toString(){
        return "A Square with side="+side+", which is a subclass of"+super.toString();
    }
}
