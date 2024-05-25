package com.automationsession.may25;

public class Casting {

    public static void main(String[] args) {

        //widening type casting
        int num1 = 139;
        double num2 = num1;
        System.out.println("Widening");
        System.out.println("Initial Value : "+num1);
        System.out.println("Final Value : "+num2);

        //narrowing type casting
        double num4 = 345678.56789;
        int num5 = (int) num4;
        System.out.println("Narrowing");
        System.out.println("Initial Value : "+num4);
        System.out.println("Final Value : "+num5);

    }

}
