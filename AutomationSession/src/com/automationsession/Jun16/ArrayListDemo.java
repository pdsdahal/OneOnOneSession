package com.automationsession.Jun16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {

        //
        ArrayList listDemo =  new ArrayList<String>();
        //add element list
        listDemo.add("Apple");
        listDemo.add("Ball");
        listDemo.add("Cat");

        Scanner scanner = new Scanner(System.in);

        for(int i=2;i<6;i++){
            System.out.println("Enter a data : ");
            String data = scanner.nextLine();
            //insert element in list
            listDemo.add(data);
        }


        //accss from list
        System.out.println("Element at index 2 : "+listDemo.get(2));

        for(int i=0;i < listDemo.size(); i++){
            System.out.println("Element at : "+i +" = "+listDemo.get(i));
        }

        //delete








    }
}
