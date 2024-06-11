package com.automationsession.Jun10;

public class ErrorDiscussion {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 1;

        if(num2 != 0) {
            int result = num1 / num2;
            System.out.println(num1 + " / " + num2 + "  = " + result);
        }else{
            System.out.println("No Division");
        }
    }
}
