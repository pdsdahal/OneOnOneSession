package com.automationsession.Jun12;

public class ContinueDemo {

    public static void main(String[] args) {

        for(int i = 0;i<100;i++) {// i=0,....99

            System.out.println("Hello from top of the if block : "+i);

            if (i == 100) {
                continue;
            }

            int num3 = 10;
            if(num3 == 10){
                System.out.println("Num 3 : "+num3);
            }
        }

        System.out.println("End....");


        int count = 10;
        do{
            if(count == 16){//
                continue;
            }
            System.out.println("Value of count : "+count);//10, 12, 14
            count = count +2;//12, 14, 16
        }while(count <= 20);
    }
}
