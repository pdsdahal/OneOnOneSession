package com.automationsession.Jun8;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        //odd : 1,3,5,7,9
        //even : 2,4,6,8,10..

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        while(counter < 10) {
            System.out.println("Enter a number : ");
            int num1 = scanner.nextInt();

            if (num1 % 2 == 0) {
                System.out.println("This is even : " + num1);
                break;
            } else {
                System.out.println("This is odd : " + num1);
            }

            counter++;
        }
        scanner.close();
    }

}
