package com.classwork.may24;

public class Employee {

    // instance variables
   public String employeeName;
   private String address;
   int age;
   static double salary = 344.56;


    public void setEmployee(){

         employeeName = "Ram Pandey";
         address = "Ktm";
         age = 12;
    }

    public void getEmployee(){
        System.out.println("Employee Details");
        System.out.println("Name : "+employeeName);
        System.out.println("Address : "+address);
        System.out.println("Age : "+age);
    }



    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployee();
        employee.getEmployee();

        employee.employeeName = "ABC";

        System.out.println("Sal " +Employee.salary);


    }




}
