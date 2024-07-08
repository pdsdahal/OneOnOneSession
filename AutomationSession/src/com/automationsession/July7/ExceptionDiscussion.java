package com.automationsession.July7;

import dev.failsafe.internal.util.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionDiscussion {

    public static void main(String[] args) {

//
//        int num1 = 10;
//        int num2 = 0;
//        int result = num1/num2;
//        System.out.println(num1 + " / "+num2 + " = "+result);

//        String userName = null;
//        System.out.println("Lenght of UserName : "+userName.length());


//        List<String> studentList = new ArrayList<>();
//        studentList.add("Ram Pandey");
//        studentList.add("Sita Pandey");
//        studentList.add("Hari Dahal");
//        studentList.add("Gita Shrestha");
//
//        String elementAtIndex10 = studentList.get(3);
//        System.out.println("Element at index 10 : "+elementAtIndex10);



        String name = "";
        System.out.println("Length is : "+name.length());

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a age : ");
        int age = scanner.nextInt();
        System.out.println("Age : "+age);
        scanner.close();


    }

}
