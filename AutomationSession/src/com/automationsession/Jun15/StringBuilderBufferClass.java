package com.automationsession.Jun15;

public class StringBuilderBufferClass {

    public static void main(String[] args) {

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Employee Name : Ram Pandey\n").append("Employee Age : 13");


        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("University Name : Texas State University");

        System.out.println("Using Builder: "+stringBuilder);



        stringBuffer.append("\nKtm");
        System.out.println("Using Buffer : "+stringBuffer);

    }
}
