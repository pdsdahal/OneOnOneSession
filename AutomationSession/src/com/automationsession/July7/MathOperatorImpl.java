package com.automationsession.July7;

public class MathOperatorImpl implements MathOperator {

    @Override
    public double add(double num1, double num2) {
       double result  = num1 + num2;
       return result;
    }

    @Override
    public void sub(double num1, double num2) {

    }


    public static void main(String[] args) {

        MathOperatorImpl obj = new MathOperatorImpl();
        double result = obj.add(10,20);
        System.out.println(result);
    }
}
