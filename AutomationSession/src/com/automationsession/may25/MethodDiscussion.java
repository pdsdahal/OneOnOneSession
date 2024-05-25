package com.automationsession.may25;

public class MethodDiscussion {

    //accessModifiers returnType methodName (optional - paramter)
    public void findSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("The sum of "+num1 + " ,  "+ num2 + " = "+sum);
    }

    //method with return type
    public int findMul(){
        int num1 = 4;
        int num2 = 6;
        int mul = num1 * num2;
        return mul;
    }

    //method with paramter
    public void displyAllInfo(String employeeName, int age, String phoneNo, boolean gender, double income){

        System.out.println("Name : "+employeeName);
        System.out.println("Age : "+age);
        System.out.println("PhoneNo : "+phoneNo);
        System.out.println("Gender : "+gender);
        System.out.println("Income : "+income);
    }

    //static mehtod with no return type, with parameters
    static public void calculateAreOfTrianlge(double h, double b){
        double area = (1/2)*b * h;
        System.out.println("Are of triangle  : "+area);
    }

    public static void main(String[] args) {
        MethodDiscussion methodDiscussion = new MethodDiscussion();
        //pass by value : arguments
        methodDiscussion.displyAllInfo("Sita Dahal", 35, "456789", true, 45.45);

        int result = methodDiscussion.findMul();
        System.out.println("Multiplication of 4*6 = "+result);

        methodDiscussion.findSum(10, 30);


        //accessing static method
        MethodDiscussion.calculateAreOfTrianlge(4,7);


    }

}
