package com.targetindia.program;

import com.targetindia.model.Circle;
import com.targetindia.model.Rectangle;
import com.targetindia.model.Square;
import com.targetindia.model.Shape;

public class Program {
    public static void main(String[] args) {
        Shape shapes[]={
                new Circle(),
                new Rectangle(),
                new Square(),
                new Circle(3,"blue",true),
                new Rectangle(2, 3, "blue", false),
                new Square(3, "blue", true),
                new Circle(5),
                new Rectangle(4, 5),
                new Square(6)
        };

        for(Shape shape: shapes){
            System.out.println(shape.toString());
            System.out.println("Area:"+shape.getArea()+" Perimeter:"+shape.getPerimeter());
        }
    }
}