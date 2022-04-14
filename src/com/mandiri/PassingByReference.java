package com.mandiri;

import java.util.Arrays;

public class PassingByReference {
    public static void main(String[] args) {
        Integer []  numbers ={3,4,6,1,2};
//        Integer [] anotherNumbers = number;
//
//        anotherNumbers[4] =99;
//
//        System.out.println(Arrays.toString(number));
//        System.out.println(Arrays.toString(anotherNumbers));

        decreaseByOne(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void  decreaseByOne(Integer [] numbers){
        for (int i = 0; i < numbers.length; i++) {
            //numbers[i] = numbers[i] -1;
            numbers[i]--;
        }
    }
}
