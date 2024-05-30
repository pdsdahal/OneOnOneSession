package com.automationsession.May28;

import java.util.Scanner;

public class GetUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number ");
        // get integer number from user
        int num1 = scanner.nextInt();

        // get double from user
        double num2 = scanner.nextDouble();

        //get string from user
        String name = scanner.nextLine();

        System.out.println("Entered number is : "+num1);

        scanner.close();
    }
}
