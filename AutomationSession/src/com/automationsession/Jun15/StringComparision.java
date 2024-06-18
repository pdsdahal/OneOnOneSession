package com.automationsession.Jun15;

public class StringComparision {

    public static void main(String[] args) {

        //using equals method
        String input = "Texas";
        String expected = "Texas";
        boolean result =  input.equals(expected);
        System.out.println("Input : "+input + " , Expected : "+expected + " = "+result) ;

        //using equalsIgnoreCase
        String inputCollegeName = "Saint Louis University";
        String expectedUniName = "saint LOuis University";
        boolean result1 = inputCollegeName.equalsIgnoreCase(expectedUniName);
        System.out.println("Input : "+inputCollegeName + " , Expected : "+expectedUniName + " = "+result1) ;

        //using contentEquals
        boolean result2 =  inputCollegeName.contentEquals(expectedUniName);
        System.out.println("Using content equal : "+result2);

        //using ==
        String data1 = "Ram Pandey";
        String data2 = "Ram Pandey";
        boolean result3 =  data1 == data2;
        System.out.println("Using == : "+result3);


        // compareToIgnoreCase , compareTo
        String countryName1 = "USA";
        String countryName2 = "usa";
        int result4 = countryName1.compareToIgnoreCase(countryName2);
        System.out.println("Using compareTo : "+result4);



    }
}
