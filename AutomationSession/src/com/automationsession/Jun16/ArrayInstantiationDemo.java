package com.automationsession.Jun16;

import java.util.Scanner;

public class ArrayInstantiationDemo {

    public static void main(String[] args) {

        int[] ages = new int[4];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i< ages.length; i++) {
            System.out.println("Enter your age");
            int input = scanner.nextInt();
            ages[i] = input;
        }

        //access

        for(int elm : ages){
            System.out.println(elm);
        }


    }
}
