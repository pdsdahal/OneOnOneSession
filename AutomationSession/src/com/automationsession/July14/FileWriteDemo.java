package com.automationsession.July14;

import java.io.FileWriter;

public class FileWriteDemo {

    public static void main(String[] args) {

        String filePath = "/Users/sdahal/GitRepos/OneOnOneSession/AutomationSession/src/com/automationsession/July14/employee.csv";
        //write

        try {
            FileWriter fileWriter = new FileWriter(filePath, true);

            String message  = "\n13,Suresh Dahal,Texas";
            fileWriter.write(message);

            fileWriter.close();

            System.out.println("Write Successfully!");

        }catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }




    }
}
