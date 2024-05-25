package com.automationsession.may23;

public class InstanceAndStaticVariables {

    private int id;
    public String universityName;
    private static String zipcode;
    public static String phoneNo;


    public static void main(String[] args) {

        //accessing instance variables
        InstanceAndStaticVariables.phoneNo = "12345678";
        InstanceAndStaticVariables.zipcode = "63119";

        //accessing non-static variables
        InstanceAndStaticVariables  obj = new InstanceAndStaticVariables();
        obj.id = 10;
        obj.universityName = "Abc university";

        System.out.println("University Details");
        System.out.println("Name : "+obj.universityName);
        System.out.println("Id : "+obj.id);
        System.out.println("PhoneNo : "+InstanceAndStaticVariables.phoneNo);
        System.out.println("ZipCode : "+InstanceAndStaticVariables.zipcode);
    }
}
