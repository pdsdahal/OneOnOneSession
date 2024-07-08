package com.automationsession.July5;

public class RunTimePolyChildClass extends RunTimePolyParentClass{

    private double totBalance = 1000;

    @Override
    public void setBalance(double balance){
        totBalance = totBalance + balance;// 1000+1200 = 2200
        System.out.println("Total Balance from child class : "+totBalance +"\n\n");

    }


    public static void main(String[] args) {

        RunTimePolyChildClass objChild = new RunTimePolyChildClass();
        objChild.setBalance(1200);

        objChild.showParentIncome();

        // create a parent class object to access parent class setBalance method

        RunTimePolyParentClass objParent = new RunTimePolyParentClass();
        objParent.setBalance(3000);
        objParent.showParentIncome();

        //upcasting : parent = child
        //it call the child class method at runtime
        // method overriding
        RunTimePolyParentClass  upcastingChild =  new RunTimePolyChildClass();
        upcastingChild.setBalance(10000);

    }
}
