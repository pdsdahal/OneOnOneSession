package com.automationsession.July14;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReadDemo {

    public static void main(String[] args) {

        String filePath = "/Users/sdahal/GitRepos/OneOnOneSession/AutomationSession/src/com/automationsession/July14/employee.csv";
        //read
        StringBuilder contentFromEmployee = new StringBuilder();

        try {
            FileReader fileReader = new FileReader(filePath);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String content;

            while((content = bufferedReader.readLine())!=null) {

                String[] contents = content.split(",");
                String id = contents[0];
                String name = contents[1];
                String address = contents[2];

                contentFromEmployee.append(id).append(",").append(name).append("\n");

            }

            bufferedReader.close();
            fileReader.close();

            System.out.println(contentFromEmployee.toString());

        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
}
