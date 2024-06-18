package com.automationsession.Jun16;

public class ArrayDeclarationDemo {

    public static void main(String[] args) {


        //integer array
        int[] ages = {3,6,7,98,910,45456};

        //String array
        String[] employeeNames = {"Ram Pandey", "Hari Dahal", "Ganga P"};

        //accessing element from array
        //by providing index
        System.out.println("By giving specific index : "+ages[3]);


        //by using looping
        for(int i= 0;i<ages.length;i++){
            System.out.println(ages[i]);
        }

    }
}
