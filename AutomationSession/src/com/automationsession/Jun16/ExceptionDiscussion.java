package com.automationsession.Jun16;

import java.util.Scanner;

public class ExceptionDiscussion {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 0;

        try {
            int resultDiv = num1 / num2;
            System.out.println(resultDiv);
        }catch(Exception e){
            System.out.println("Exception from 1");
        }

        String firstName = null;

        try {
            System.out.println(firstName.length());

        }catch(NullPointerException e){
            System.out.println("Message : "+e.getMessage());

        }

        int[] days = {1,4,7};
        try {
            System.out.println(days[7]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Message : "+e.getMessage());
        }
    }
}
