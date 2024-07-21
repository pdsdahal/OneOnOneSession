package com.automationsession.July19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DataDelete {

    public String deleteData(){

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
            String sql = "delete from driver_detail where id = ?;";
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, "6");


            // 5. Execute Statement
            int result = pstm.executeUpdate();

            if(result >=1){
                message = "Data Deleted successffully!";
            }else{
                message = "Failed to Delete.";
            }

            //step 7
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return message;
    }

    public static void main(String[] args) {

        DataDelete ds = new DataDelete();
        String message = ds.deleteData();
        System.out.println(message);
    }
}
