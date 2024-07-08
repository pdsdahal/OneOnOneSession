package com.automationsession.July5;

public class ExtendChild extends ExtendParent {

    private String childPhoneNo;

    public ExtendChild(String name, int age, String address, String childPhoneNo) {
        super(name, age, address);
        this.childPhoneNo = childPhoneNo;

        super.showParentInfo();
    }

    public void showChildPhoneNo(){
        System.out.println("Child Phone No : "+childPhoneNo);
    }


    public static void main(String[] args) {

        ExtendChild obj = new ExtendChild("Ram Pandey", 40,"St. Louis","234567890");

        obj.showChildPhoneNo();

    }
}
