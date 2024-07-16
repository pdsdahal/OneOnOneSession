package com.automationsession.July15;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class DataReadFromJson {

    public static void main(String[] args)  {


        try {
            String jsonResponse = "{\"page\":2,\"per_page\":6,\"total\":12,\"total_pages\":2,\"data\":[{\"id\":7,\"email\":\"michael.lawson@reqres.in\",\"first_name\":\"Michael\",\"last_name\":\"Lawson\",\"avatar\":\"https://reqres.in/img/faces/7-image.jpg\"},{\"id\":8,\"email\":\"lindsay.ferguson@reqres.in\",\"first_name\":\"Lindsay\",\"last_name\":\"Ferguson\",\"avatar\":\"https://reqres.in/img/faces/8-image.jpg\"},{\"id\":9,\"email\":\"tobias.funke@reqres.in\",\"first_name\":\"Tobias\",\"last_name\":\"Funke\",\"avatar\":\"https://reqres.in/img/faces/9-image.jpg\"},{\"id\":10,\"email\":\"byron.fields@reqres.in\",\"first_name\":\"Byron\",\"last_name\":\"Fields\",\"avatar\":\"https://reqres.in/img/faces/10-image.jpg\"},{\"id\":11,\"email\":\"george.edwards@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Edwards\",\"avatar\":\"https://reqres.in/img/faces/11-image.jpg\"},{\"id\":12,\"email\":\"rachel.howell@reqres.in\",\"first_name\":\"Rachel\",\"last_name\":\"Howell\",\"avatar\":\"https://reqres.in/img/faces/12-image.jpg\"}],\"support\":{\"url\":\"https://reqres.in/#support-heading\",\"text\":\"To keep ReqRes free, contributions towards server costs are appreciated!\"}}";

            JSONParser jsonParser = new JSONParser();
            JSONObject responseObject =  (JSONObject) jsonParser.parse(jsonResponse);

            // starting with { - json Object
            // [ - json array

            int page =  Integer.valueOf(responseObject.get("page").toString());
            int per_page =  Integer.valueOf(responseObject.get("per_page").toString());
            int total =  Integer.valueOf(responseObject.get("total").toString());
            int total_pages =  Integer.valueOf(responseObject.get("total_pages").toString());

            System.out.println("page : "+page);
            System.out.println("per_page : "+per_page);
            System.out.println("Total : "+total);
            System.out.println("Total Pages : "+total_pages);

            JSONArray dataArray = (JSONArray)responseObject.get("data");

            for(int i=0;i <dataArray.size(); i++){

                JSONObject dataObject = (JSONObject) dataArray.get(i);

                int id = Integer.parseInt(dataObject.get("id").toString());
                String email = dataObject.get("email").toString();
                String first_name = dataObject.get("first_name").toString();
                String last_name = dataObject.get("last_name").toString();
                String avatar = dataObject.get("avatar").toString();

                System.out.println("id : "+id + " Email : "+email + " First Name : "+first_name + " Last Name : "+last_name + " Avatar : "+avatar);
            }


            JSONObject supportObj = (JSONObject) responseObject.get("support");
            String url = supportObj.get("url").toString();
            String text = supportObj.get("text").toString();

            System.out.println("Url : "+url);
            System.out.println("Text : "+text);

        }catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }
}
