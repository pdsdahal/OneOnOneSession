package com.automationsession.Jun17;

public class EmployeeInfo {

    //constructor without argument
    public EmployeeInfo(){
        System.out.println("This is default");
    }

    //constructor with argument
    public EmployeeInfo(String name, int age, String address){

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }

    public static void main(String[] args) {

        EmployeeInfo employeeInfo = new EmployeeInfo("Ram", 13, "St. Louis");


        EmployeeInfo employeeInfo1 = new EmployeeInfo("Ram", 13, "St. Louis");

    }

}
