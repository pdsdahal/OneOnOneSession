package com.automationsession.Jun4;

public class MulTable {

    public static void main(String[] args) {

        int num1 = 1;
        do{
            int num2 = 1;
            do {
                int mul = num1 * num2;//2 * 1
                System.out.println(num1 + " * " + num2 + " = " + mul);
                num2 = num2 + 1;// 2
            }while(num2<=10);// 2 <= 10

            num1 = num1 + 1;// 1+1 = 2

            System.out.println();

        }while(num1 <=20);


    }
}