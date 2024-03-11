package com.targetindia;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.program=program;
        this.year=year;
        this.fee=fee;
    }

    @Override
    public String toString(){
        return "Stdent["+super.toString()+",program="+program+",year="+year+",fee="+fee+"]";
    }
}
