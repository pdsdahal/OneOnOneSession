package com.automationsession.Jun17;

public class ThrowDemo {

    public void checkAgeForVote(int age) throws Exception {

        if(age < 16){
            throw new Exception("You are under 16.");
        }
    }

    public static void main(String[] args) {

        ThrowDemo obj = new ThrowDemo();
        try {
            obj.checkAgeForVote(12);
        } catch (Exception e) {
            System.out.println("Message : "+e.getMessage());
        }


    }


}
