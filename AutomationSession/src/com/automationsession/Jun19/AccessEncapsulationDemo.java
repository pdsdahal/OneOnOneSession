package com.automationsession.Jun19;

public class AccessEncapsulationDemo {

    private EncapsulationDemo encapsulationDemo;

    public AccessEncapsulationDemo(EncapsulationDemo encapsulationDemo){
        this.encapsulationDemo = encapsulationDemo;
    }

    private int calculaterArea(){

        int l;
        int b;

        l = encapsulationDemo.getBre();
        b = encapsulationDemo.getLen();

        System.out.println("L : "+l);
        System.out.println("B : "+b);
        return l*b;
    }


    public static void main(String[] args) {

        EncapsulationDemo encapsulationDemo = new EncapsulationDemo();
        encapsulationDemo.setBre(10);
        encapsulationDemo.setLen(15);

        AccessEncapsulationDemo accessEncapsulationDemo = new AccessEncapsulationDemo(encapsulationDemo);
        int resultArea = accessEncapsulationDemo.calculaterArea();
        System.out.println("Area : "+resultArea);

    }
}
