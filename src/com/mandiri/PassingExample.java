package com.mandiri;

public class PassingExample {
    public static void main(String[] args) {
        Integer a = 4;
        Integer b = a; //Passinng By Value
        a += 1;
        System.out.println(a);
        System.out.println(b);

        String name = "Angga";
        changeName(name);
        System.out.println(name);
    }

    public static void  increase(Integer x){
        x = x+1;
        System.out.println("X :"+x);
    }

    public static  void changeName(String name){
        name ="BERUBAH";
    }
}
