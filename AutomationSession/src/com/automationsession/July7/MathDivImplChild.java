package com.automationsession.July7;

public class MathDivImplChild implements MathOperator, DivisionOperation {
    @Override
    public double div(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double mod(double num1, double num2) {
        return 0;
    }

    @Override
    public double add(double num1, double num2) {
        return 0;
    }

    @Override
    public void sub(double num1, double num2) {

    }

    public static void main(String[] args) {
        MathDivImplChild obj = new MathDivImplChild();
        double result = obj.div(20,2);
        System.out.println("Result : "+result);

    }
}
