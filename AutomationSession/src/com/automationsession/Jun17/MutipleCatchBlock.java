package com.automationsession.Jun17;

public class MutipleCatchBlock {

    public static void main(String[] args) {


        try{


        }catch(ArithmeticException e){

        }catch(NullPointerException e1){

        }catch (NumberFormatException e){

        }



        try{


        }catch(ArithmeticException | NullPointerException | NumberFormatException e){

        }


    }
}
