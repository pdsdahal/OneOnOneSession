package com.automationsession.Jun2;

import java.util.Scanner;

public class IfElseDemo {

    public static void main(String[] args) {

        double totalPrice = 1000;
        double discount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your city name ");
        String cityName = scanner.nextLine();

        if(cityName.equals("Kathmandu")){
            discount = 500;
        }else{
            discount = 0;
        }

        totalPrice = totalPrice- discount;
        System.out.println("Discount : "+discount);
        System.out.println("Your price is : "+totalPrice);

        scanner.close();
    }
}