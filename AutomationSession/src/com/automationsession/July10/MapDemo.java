package com.automationsession.July10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

    public static void main(String[] args) {


        String empName = "Ram Pandey";
        int rollNo = 12;


        Map<String, String> hashMap = new HashMap<String, String>();

        //add element in map
        hashMap.put("us", "United States");
        hashMap.put("npl", "Nepal");
        hashMap.put("inr", "India");

        // fetch key
        String value = hashMap.get("npl");
        System.out.println("Value of npl : "+value);

        //remove
        hashMap.remove("inr");


       //using key : Set
        Set<String> set_key = hashMap.keySet();
        for(String key : set_key){
            String value1 = hashMap.get(key);
            System.out.println("Key : "+key + " Value : "+value1);
        }


        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "Ram Pandey");
        hashMap1.put(2, "Sita Pandey");



    }
}
