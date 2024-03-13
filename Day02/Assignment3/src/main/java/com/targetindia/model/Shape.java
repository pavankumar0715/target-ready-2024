package com.targetindia.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Shape {
    private String color="red";
    private boolean filled=true;

    public abstract double getPerimeter();
    public abstract double getArea();

    @Override
    public String toString(){
        return "A Shape with color of" +color +" and " +(filled?"Filled":"Not filled");
    }
}
