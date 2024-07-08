package com.automationsession.July5;

public class MutilevelSon extends MutilevelParent {


    public void myPropertyson(){
        System.out.println("Gold : 5 tola");
        System.out.println("Money : 30000");
    }
    public static void main(String[] args) {

        MutilevelSon son = new MutilevelSon();
        son.myPropertyGrand();
        son.myPropertyParent();
        son.myPropertyson();

    }

}
