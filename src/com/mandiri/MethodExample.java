package com.mandiri;

import java.util.Arrays;

public class MethodExample {
    public static void main(String[] args) {
        Integer variable1 = 5;
        Integer variable2 = 3;

        System.out.println("START");
        //Return Value
        Integer result = add(5,4);
        System.out.println(result);
        System.out.println("END RETURN");
//
//        //Void
        addnoreturn(5,2);

//
//        //greet
        System.out.println(greet("Wayne"));

        String [] names ={"Angga","Bruce","Tony","Diana"};
        System.out.println("DONE!");

        //CHALLENGE
        String [] members ={"Angga","Bruce","Tony","Diana"};
        updateName(2,"Stark",members);


    }


    //METHOD
    public static void updateName(Integer index, String name, String [] members){
        //Cara 1 Assignment langsung
        members[index] = name;
        //Cara 2 FOR
        for (int i = 0; i < members.length; i++) {
            if (i == index){
                members[index] = name;
            }
        }
        System.out.println(Arrays.asList(members));

    }

    public static String greet(String name){
        return "Hello "+name;
    }

    public static Integer add(Integer x,Integer y){
        Integer result = x+y;
        return  result;
    }

    public static void addnoreturn(Integer x, Integer y){
        System.out.println(x+y);
    }
}
