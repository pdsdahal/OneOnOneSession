package com.automationsession.Jun4;

public class DoWhileDemo {

    public static void main(String[] args) {

        int flag = 0;
        do{

            int num1 = 100;
            int num2 = 200;
            int result = num1 + num2;

            System.out.println(num1 + " + "+num2 + " = "+result);

            flag++; //1 //2// 99//100,101

        }while(flag <= 100);// 1 <=100 , 2<=100... 99 <= 100, 100 <=100, 101<=100

        System.out.println("Outside the do while block...");


    }
}
