package com.lwj.java1;

import lombok.Data;

@Data
public class Persion {

    private String name;
    private int age;


    public static Persion instance = new Persion();

    public static  int num1  ;
    public static  int num2 = 0 ;


    private Persion (){
        num1++;
        num2++;
    }



    public static Persion getInstance(){
        return instance;
    }



    public static void main(String[] args) {
//        Persion persion = new Persion();
//        persion.setAge(11);
//
//        System.out.println(persion);


        Persion.getInstance();

        System.out.println(Persion.num1);
        System.out.println(Persion.num2);


    }



}
