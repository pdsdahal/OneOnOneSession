package com.automationsession.July7;

public class TryCatchFinally {

    public static void main(String[] args) {


        int num1 = 10;
        int num2 = 2;

        try {
            int result = num1 / num2;
            System.out.println(num1 + " / "+num2 + " = "+result);

        }catch(Exception e){
            System.out.println("Reason : "+e.getMessage());
        }finally {
            System.out.println("Inside the final block.");
        }



    }
}
