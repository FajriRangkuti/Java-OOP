package com.mandiri;


import com.mandiri.model.Car;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Ferari","Kuda","Green");// <--- OBJECT
        System.out.println(myCar.brand +" "+ myCar.name);

        myCar.addFuel(10);
        myCar.engineStart();
        System.out.println(myCar);

//        System.out.println(myCar.name);
//        Car otherCar = new Car("Honda","Jazz");
//        System.out.println(otherCar);
//
//        Car anotherCar = new Car();
//        System.out.println(anotherCar);

//        myCar.brand = "Toyota";
//        myCar.color = "Brown";
//        myCar.name = "Terios";
//        myCar.changeColor("Green");

//        Car anotherCar = myCar;//<--passing by reference(yang di pasing nilai dari hashcode)
//        anotherCar.brand = "Daihatsu";
//        anotherCar.name = "Xenia";
//        anotherCar.color = "Red";
////
////        System.out.println(myCar);
//        System.out.println(myCar.brand);
//        System.out.println(myCar.color);
//        System.out.println(myCar.name);
//
//        System.out.println(myCar);
//        System.out.println(anotherCar);

    }



}
