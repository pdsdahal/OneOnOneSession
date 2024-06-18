package com.automationsession.Jun16;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {

        List<String> listDemo2 = new ArrayList<String>();
        listDemo2.add("Ram Pandey");
        listDemo2.add("Sita Pandey");
        listDemo2.add("Gita Pandey");
        listDemo2.add("Hari Pandey");

        System.out.println("Before Delete : ");
        System.out.println(listDemo2);

        System.out.println("After Delete");
        listDemo2.remove(2);
        System.out.println(listDemo2);

        //update
        listDemo2.set(2, "Shankar Dahal");
        System.out.println("After Update");
        System.out.println(listDemo2);

        //entire list clear
        listDemo2.clear();

    }
}
