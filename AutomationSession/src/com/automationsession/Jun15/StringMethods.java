package com.automationsession.Jun15;

public class StringMethods {

    public static void main(String[] args) {

        String collegeName = "Texas State University";

        //charAt :
        char indexAt4 = collegeName.charAt(4);
        System.out.println("Index at 4 : "+indexAt4);

        //using toCharArray
        char[] allchars = collegeName.toCharArray();
        for(int i=0; i<allchars.length;i++){
            char value = allchars[i];
            System.out.println("Value at index : "+i+" : "+value);
        }


    }
}
