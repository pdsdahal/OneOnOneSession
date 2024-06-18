package com.automationsession.Jun15;

public class StringConversion {

    public static void main(String[] args) {

        String rollNo = "100";
       // int
        int roll = Integer.parseInt(rollNo);
        System.out.println(roll);


        String num1 = "100.34";
        //double
        double num1_1 = Double.parseDouble(num1);
        System.out.println(num1_1);


        //int to String conversion
        int register1 = 13;
        String register1_1 =  String.valueOf(register1);
        System.out.println(register1_1);

        //double to String conversion
        double register1_total_sales = 130.67;
        String register1_total_sales_1 =  String.valueOf(register1_total_sales);
        System.out.println(register1_total_sales_1);


    }
}
