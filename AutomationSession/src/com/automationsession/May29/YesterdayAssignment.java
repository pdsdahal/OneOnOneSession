package com.automationsession.May29;

import java.util.Scanner;

public class YesterdayAssignment {

    public boolean findGreater(double num1, double num2){
        boolean result = num1 > num2;
        return result;
    }

    public double findSum(double num1, double num2){
        return (num1+num2);
    }


    public static void main(String[] args) {
        YesterdayAssignment obj = new YesterdayAssignment();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        boolean result1 = obj.findGreater(num1, num2);
        System.out.println(num1+ " > "+num2 + " = "+result1);

        double result2  = obj.findSum(num1, num2);
        System.out.println(num1+ " + "+num2 + " = "+result2);
        scanner.close();
    }
}
