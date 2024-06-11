package com.automationsession.Jun10;

public class BreakDemo {

    public static void main(String[] args) {

      for(int j=0; j<5; j++) {// j= 0,1
          for (int i = 0; i < 10; i++) {// i = 0, 1, 2,3,4,5,6, 7
              if (i == 7) {
                  break;
              } else {
                  System.out.println("Value of i : " + i);// 0, 1, 2,3,4,5,6
              }
          }
      }
    }
}
