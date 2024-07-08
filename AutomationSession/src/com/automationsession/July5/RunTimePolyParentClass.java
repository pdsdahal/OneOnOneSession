package com.automationsession.July5;

public class RunTimePolyParentClass {

    private double balance;//3000


    public void setBalance(double balance){
        this.balance = balance;// 3000
    }

    public void showParentIncome(){
        double familyIncome = 2300;
        double totalBalance = familyIncome + balance;//2300 + 3000
        System.out.println("Family Income from parent class : "+familyIncome);
        System.out.println("Total Balance from parent class: "+totalBalance+"\n\n");

    }

}
