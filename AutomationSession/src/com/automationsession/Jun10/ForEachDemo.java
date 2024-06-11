package com.automationsession.Jun10;

public class ForEachDemo {

    public static void main(String[] args) {

        //default values in array
        int[] rollNos = {1,3,5,7,8,89,99};

        //using for loop
        System.out.println("Using for loop");
        for(int i=0; i < rollNos.length; i++){
            System.out.println(rollNos[i]);
        }

        //using for each
        System.out.println("Using for each loop");
        for(int rollNo : rollNos){
            System.out.println(rollNo);
        }



    }
}
