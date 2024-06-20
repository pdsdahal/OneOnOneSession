package com.automationsession.Jun19;

public class ThisDemo {

    private int employeeId;
    private String employeeName;
    private String employeeAddress;

    public ThisDemo(){
        System.out.println("Default Constructor");
    }

    public ThisDemo(int employeeId, String employeeName, String employeeAddress){

        this();// default constructor call

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;

        //this.methodName
        // methodName
        this.displayEmployeeInfo();

    }

    public void displayEmployeeInfo(){
        System.out.println("Id : "+employeeId);
        System.out.println("Name : "+employeeName);
        System.out.println("Address : "+employeeAddress);
    }

    public static void main(String[] args) {

        ThisDemo demo = new ThisDemo(10, "Ram Pandey", "St. Louis");
        //demo.displayEmployeeInfo();
    }
}
