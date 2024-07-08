package com.automationsession.July5;

public class SingleInheritanceChild extends SingleInheritanceParent {

    public int div(int num1, int num2){
        int result = num1 / num2;
        return result;
    }


    public static void main(String[] args) {

        SingleInheritanceChild  objChild = new SingleInheritanceChild();

        // SingleInheritanceParent objParent = new SingleInheritanceParent();
        System.out.println("Add : "+objChild.add(10,20));
        System.out.println("substract : "+objChild.substract(20,10));
        System.out.println("Div : "+objChild.div(20,10));

    }

}
