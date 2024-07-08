package com.automationsession.July5;

public class ExtendParent {

    private String name;
    private int age;
    private String address;

    public ExtendParent(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void showParentInfo(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Address : "+address);
    }
}
