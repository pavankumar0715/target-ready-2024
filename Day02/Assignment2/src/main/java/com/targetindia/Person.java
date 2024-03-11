package com.targetindia;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name, address;

    @Override
    public String toString(){
        return "Person[name=" +name+", address="+address;
    }
}
