package com.automationsession.Jun9;

import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num2 = scanner.nextInt();

        int sum = 0;
        for(int i=1;i<=10;i++){
            int num1 = i;
            int result =  num2 * num1; //10
            sum = sum + result;// 1+5 = 6, 6+10 = 16
            System.out.println(num2 + " * "+num1 + " = "+result);
        }

        System.out.println("final sum : "+sum);
    }
}

// 1 4 5 6 45 3 -78