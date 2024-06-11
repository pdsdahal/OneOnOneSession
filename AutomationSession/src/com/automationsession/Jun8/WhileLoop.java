package com.automationsession.Jun8;

public class WhileLoop {

    public static void main(String[] args) {

        int num1 = 4;
        int mul = 1;
        while(mul <= 10) {// 1<=10
            int res = num1 * mul;//  = 4 * 1 = 4
            System.out.println(num1 +" * "+mul+ " = "+res);
            mul++;
        }

    }
}
