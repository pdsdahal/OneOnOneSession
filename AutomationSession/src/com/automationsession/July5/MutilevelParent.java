package com.automationsession.July5;

public class MutilevelParent extends MutilevelGrandParent {

    public void myPropertyParent(){
        System.out.println("Gold : 4 tola");
        System.out.println("Money : 20000");
    }


    public static void main(String[] args) {

        MutilevelParent parent = new MutilevelParent();
        parent.myPropertyGrand();
        parent.myPropertyParent();
    }

}
