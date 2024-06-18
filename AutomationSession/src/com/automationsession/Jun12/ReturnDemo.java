package com.automationsession.Jun12;

public class ReturnDemo {

    public void momBackToHome(int totalAmount, String depositedBy){
        if(totalAmount > 50) {
            System.out.println("Deposited");
            System.out.println("Deposited By : "+depositedBy);
        }else{
            System.out.println("You are not allowed!");
        }
    }

    public double dadBackToHome(){
        int totalAmount = 100;
        double amountSpentWalmart = 12.56;
        double leftAmount = totalAmount - amountSpentWalmart;
        return leftAmount;
    }


    public static void main(String[] args) {

        ReturnDemo returnDemo = new ReturnDemo();
        returnDemo.momBackToHome(51, "Ram Pandey");

        double remainingAmount = returnDemo.dadBackToHome();
        System.out.println("remainingAmount : "+remainingAmount);
    }
}
