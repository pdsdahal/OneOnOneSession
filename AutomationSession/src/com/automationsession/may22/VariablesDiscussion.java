package com.automationsession.may22;

public class VariablesDiscussion {

    // access_modifiers return_type methodName

    //method with no parameter no return type
    public void localVariableDiscussion(){

        //local variables
        String lastName = "Dahal";
        lastName = "Shrestha";

        int age = 13;
        double tax = 13.99;
        boolean flag = true;

        System.out.println("age : "+age);
        System.out.println(tax);
        System.out.println(flag);
    }

    public static void main(String[] args){

        VariablesDiscussion variablesDiscussion = new VariablesDiscussion();
        variablesDiscussion.localVariableDiscussion();
    }
}