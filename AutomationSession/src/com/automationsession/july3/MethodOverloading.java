package com.automationsession.july3;

public class MethodOverloading {

    public void add(int num1, int num2){
        int result = num1 + num2;
        System.out.println("Result of (two parameter int) "+num1 + " + "+num2 + " = "+result);
    }

    public void add(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        System.out.println("Result of three parameters "+num1 + " + "+num2 + " + "+num3 +" = "+result);
    }

    public void add(double num1, double num2){
        double result = num1 + num2;
        System.out.println("Result of (two parameters double) "+num1 + " + "+num2 + " = "+result);
    }


    public static void main(String[] args) {

        MethodOverloading obj = new MethodOverloading();
        obj.add(4,6);
        obj.add(4.0,6.0);
        obj.add(3,4,5);
    }

}
