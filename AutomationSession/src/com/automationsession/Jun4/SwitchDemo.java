package com.automationsession.Jun4;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the environemnt name ");

        String environmentName = scanner.nextLine();

        switch (environmentName) {

            case "DEV"://environmentName==DEV
                int sum = 20+50;
                System.out.println("Sum of 20 and 50 : "+sum);
                break;

            case "TEST":
                int sub = 20-50;
                System.out.println("Sub of 20 and 50 : "+sub);
                break;

            case "UAT":
                int mul = 20 * 50;
                System.out.println("Mul of 20 and 50 : "+mul);
                break;

            case "PROD":
                System.out.println("Prod");
                break;

             default:
                 System.out.println("not supprotive environemnt. We support only TEST, DEV , UAT and PROD");
                break;

        }


    }


}
