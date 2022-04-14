package com.mandiri.model;

public class Car {


    public String brand; //Attribute
    public String name; //Attribute
    public String color; //Attribute

    //Encapsulation
    private Integer fuel;
    private String engineStatus;
    //=================================================================

    //Constructor <<-- Harus sama dengan nam class
    //Varible harus deskriptif
    // this <-- menggambarkan attribute dari suatu class
    public Car(String brand,String name,String color){

        this.brand = brand;
        this.name = name;
        this.color = color;
        this.fuel =0;
        this.engineStatus = "Off";

    }

    public void engineStart(){
        if(this.fuel > 0){
            this.engineStatus = "On";
        }else{
            System.out.println("Fuel is Empty!");
        }
    }

    public void addFuel(Integer fuel){
        this.fuel = this.fuel + fuel;
    }

    //OverLoading Constructor
    public Car(String brand,String name){
        this.brand = brand;
        this.name = name;
        this.color = "Default";
    }

    public Car(){

    }

    //============================================================

    //Behavior / Method
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + this.brand + '\'' +
                ", name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                ", fuel='" + this.fuel + '\'' +
                ", engineStatus='" + this.engineStatus + '\'' +
                '}';
    }

    //=============================================================

    //OverLoading method
    public void changeColor(String newColor){
        color = newColor;
    }
    public void changeColor(){
        color = "Kuning";
    }

}
