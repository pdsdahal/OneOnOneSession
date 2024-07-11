package com.automationsession.July10;

import java.util.ArrayList;
import java.util.List;

public class ListImplClassDiscussion {

    public static void main(String[] args) {

        //String array list

        List<String> nameArrayList = new ArrayList<>();


        //add : it add elements in list

        nameArrayList.add("Shyam Shrestha");
        nameArrayList.add("Gita Shrestha");



        //access

        for (int i = 0; i < nameArrayList.size(); i++) {
            String name = nameArrayList.get(i);
            System.out.println("Before Remove Name : " + name);
        }

        //remove
        nameArrayList.remove(0);

        //update
        nameArrayList.add(0, "Ram Dahal");

        for (int i = 0; i < nameArrayList.size(); i++) {
            String name = nameArrayList.get(i);
            System.out.println("After Remove Name : " + name);
        }



        //Integer type array list
        ArrayList<Integer> rollNoList = new ArrayList<>();
        rollNoList.add(100);
        rollNoList.add(200);

        //access
        int index = 0;
        do {
            int rollNo = rollNoList.get(index);
            System.out.println("RollNo : " + rollNo);
            index++;
        } while (index < rollNoList.size());


        // Double type array list
        ArrayList<Double> taxList = new ArrayList<>();
        taxList.add(123.56);//0
        taxList.add(456.0);//1
        taxList.add(203.6);//2

        //access
        int ind = taxList.size()-1;//3-1 = 2
        while(ind >= 0){
            double tax = taxList.get(ind);
            System.out.println("Tax : "+tax);
            ind--;
        }



        //object type array list

        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("Ram Pandey");
        emp1.setEmpSalary(1234);

        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setEmpName("Sita Pandey");
        emp2.setEmpSalary(98654);

        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);

        //access for each
        for(Employee emp : empList){

            int empId = emp.getEmpId();
            String empName = emp.getEmpName();
            double empSal = emp.getEmpSalary();
            System.out.println("Id : "+empId + " Name : "+empName + " Sal : "+empSal);

        }


        //for loop
        for(int i=0;i<empList.size();i++){
            Employee emp =  empList.get(i);
            int empId = emp.getEmpId();
            String empName = emp.getEmpName();
            double empSal = emp.getEmpSalary();

            System.out.println("Id : "+empId + " Name : "+empName + " Sal : "+empSal);

        }



    }
}
