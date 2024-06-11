package com.automationsession.Jun9;

import java.util.Scanner;

public class Classwork {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a n terms : ");
        int n = scanner.nextInt();

        int sum = 0;
        for(int i = 0; i<n; i++){
            System.out.println("Enter a number : ");
            int num = scanner.nextInt();

            if(num<0){
                break;
            }
            sum = sum + num;
        }

        System.out.println("Sum of positive numbers : "+sum);
    }
}
