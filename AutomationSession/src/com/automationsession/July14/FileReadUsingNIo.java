package com.automationsession.July14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadUsingNIo {

    public static void main(String[] args) {

        String filePath = "/Users/sdahal/GitRepos/OneOnOneSession/AutomationSession/src/com/automationsession/July14/employee.csv";

        try {
            List<String> lstContents = Files.readAllLines(Paths.get(filePath));

            for (int i = 0; i < lstContents.size(); i++) {
                String content = lstContents.get(i);

                String[] contents = content.split(",");
                String id = contents[0];
                String name = contents[1];
                String address = contents[2];

                System.out.println("id : "+id);
                System.out.println("Name : "+name);
                System.out.println("Address : "+address);
            }


        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
        }

    }
}
