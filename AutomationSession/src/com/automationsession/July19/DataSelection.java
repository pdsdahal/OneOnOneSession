package com.automationsession.July19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataSelection {

    public List<Manager> getData(){

        List<Manager> managerList = new ArrayList<>();
        try {
            // 1. driver load
            Class.forName("com.mysql.cj.jdbc.Driver");

            String hostName = "jdbc:mysql://localhost:3306/QaDatabase";
            String userName = "Admin";
            String password = "Admin";

            // 2. sql connection
            Connection connection = DriverManager.getConnection(hostName, userName, password);

            //3. Create statement
            Statement statement = connection.createStatement();
            // 4. sql Query
            String sql = "SELECT * FROM QaDatabase.driver_detail;";
            // 5. Execute Statement
            ResultSet rs = statement.executeQuery(sql);

            //step 6. result access
            while (rs.next()) {
                int ids = rs.getInt("id");
                String name = rs.getString("name");
                String address = rs.getString("address");
                String email = rs.getString("email");
                String dob = rs.getString("dob");

                Manager manager = new Manager();
                manager.setId(ids);
                manager.setName(name);
                manager.setAddress(address);
                manager.setEmail(email);
                manager.setDob(dob);

                managerList.add(manager);


//                dataList.add(String.valueOf(ids));
//                dataList.add(rs.getString("name"));
//                dataList.add(address);
//                dataList.add(email);
//                dataList.add(dob);


            }
            //step 7
            connection.close();
            return  managerList;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {

        DataSelection ds = new DataSelection();
        List<Manager> managerList =  ds.getData();

        for(int i=0;i<managerList.size();i++){

            Manager manager =  managerList.get(i);
            System.out.println("Id : "+manager.getId());
            System.out.println("Name : "+manager.getName());
            System.out.println("Address : "+manager.getAddress());
            System.out.println("Dob : "+manager.getDob()+"\n\n");
        }
    }
}
