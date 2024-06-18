package com.automationsession.Jun17;

import org.openqa.selenium.WebElement;

public class ThisDemo {

    private int flag;
    private String name;
    private WebElement webElmUserName;


    public void setValueInUserName(String name){
        this.name = name;
    }

    public void showValue(){
        System.out.println("Name is : "+name);
    }

    public static void main(String[] args) {
        ThisDemo demo = new ThisDemo();
        demo.setValueInUserName("Ram Pandey");

        demo.showValue();
    }



}
