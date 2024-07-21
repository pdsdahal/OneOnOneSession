package com.automationsession.July19;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DataInsert {

    public String insertData(){

        String message = null;

        try {
            // 1. driver load
            Class.forName("com.mysql.cj.jdbc.Driver");

            String hostName = "jdbc:mysql://localhost:3306/QaDatabase";
            String userName = "Admin";
            String password = "Admin";

            // 2. sql connection
            Connection connection = DriverManager.getConnection(hostName, userName, password);

            //3. Create statement
            String sql = "insert into driver_detail(name,address,email,dob) values (?,?,?,?);";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, "Shiva Shrestha");
            pstm.setString(2, "St.Louis");
            pstm.setString(3,"bishnu@gmail.com");
            pstm.setString(4,"2021-01-01");

            // 5. Execute Statement
            int result = pstm.executeUpdate();

            if(result >=1){
                message = "Data inserted successffully!";
            }else{
                message = "Failed inster.";
            }

            //step 7
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return message;
    }

    public static void main(String[] args) {

        DataInsert ds = new DataInsert();
        String message = ds.insertData();
        System.out.println(message);
    }
}
