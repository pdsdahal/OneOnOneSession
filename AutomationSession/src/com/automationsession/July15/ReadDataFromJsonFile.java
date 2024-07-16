package com.automationsession.July15;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class ReadDataFromJsonFile {

    public static void main(String[] args) {

        try {
            //read json file
            String filePath = "/Users/sdahal/GitRepos/OneOnOneSession/AutomationSession/src/com/resources/response.json";
            FileReader fileReader = new FileReader(filePath);

            //parse
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);

            //use do while
            int index = 0;
            do{
                JSONObject jsonObject = (JSONObject) jsonArray.get(index);
                int postId = Integer.valueOf(jsonObject.get("postId").toString());
                int id = Integer.valueOf(jsonObject.get("id").toString());
                String name = jsonObject.get("name").toString();
                String email = jsonObject.get("email").toString();
                String body = jsonObject.get("body").toString();

                System.out.println("Id : "+id + " Email : "+email);

                index++;
            }while(index < jsonArray.size());
        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }

    }
}
