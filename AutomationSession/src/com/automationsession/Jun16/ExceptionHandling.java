package com.automationsession.Jun16;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        int targetScore = 106;
        int totalOver = 20;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Nepal final score (Numeric)");

        int nepalScore = 0;

        try {
            nepalScore = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Excpetion : " + e.getMessage());
        }finally {
            System.out.println("Inside the final block.....");
        }

        int winScore = targetScore - nepalScore;

        System.out.println("Ban won by : " + winScore);


    }
}
