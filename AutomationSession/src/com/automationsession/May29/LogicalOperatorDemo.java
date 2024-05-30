package com.automationsession.May29;

public class LogicalOperatorDemo {

    public static void main(String[] args) {

        String name = "Rita";
        String gender = "male";
        int age = 1;

        //logical and operator
      boolean result = (age >= 1) && (name=="Rita") && (gender == "Female") ;
      System.out.println(result);

      // logical or
        boolean result1 = (name == "shyam") || (gender == "female");
        System.out.println(result1);

//logical not
        boolean result2 = !((name == "shyam") || (gender == "female"));
        System.out.println(result2);

        //combine all logical operators
        double tax = 12.45;
        String companyName = "Google";
        String education = "Master";

        // (flase || false) && true : false && true : false
       boolean result3 =   (tax > 15)  || companyName.equals("Apple") && education.equals("Master");
        System.out.println(result3);

    }
}
