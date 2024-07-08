package com.automationsession.july3;

import java.util.*;

public class Important {

    //array of employees : String
    public void showEmployees(String[] employees){
        for(int i=0;i<employees.length;i++){
            System.out.println("Employee at "+i +" is "+employees[i]);
        }
    }

    // array of employees
    public void showEmplos(Employee[] emps){
        for(int i=0;i<emps.length;i++){
            Employee employee =  emps[i];
            System.out.println("ID : "+employee.getEmpId());
            System.out.println("Employee Name : "+employee.getEmpName());
            System.out.println("Employee Address : "+employee.getEmpAddress());
            System.out.println("Employee Salary : "+employee.getEmpSalary());
        }
    }

    // list of employees method
    public void sortEmployee(List<Employee> empList){
       Collections.sort(empList, new SortbyID());

        System.out.println("\n\n Using Sort method");
        for(int i= 0; i<empList.size();i++){
            Employee emp =  empList.get(i);
            System.out.println("ID : "+emp.getEmpId());
            System.out.println("Employee Name : "+emp.getEmpName());
            System.out.println("Employee Address : "+emp.getEmpAddress());
            System.out.println("Employee Salary : "+emp.getEmpSalary());
        }

    }


    public static void main(String[] args) {

        Important important = new Important();
        //array
        String[] empsArray = new String[5];
        empsArray[0] = "Ram Pandey 1";
        empsArray[1] = "Ram Pandey 2";
        empsArray[2] = "Ram Pandey 3";
        empsArray[3] = "Ram Pandey 4";
        empsArray[4] = "Ram Pandey 5";

        // call array of string
        important.showEmployees(empsArray);

        //create array of Employee
        Employee[] employeesObjArray = new Employee[2];

        //create object of employee
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setEmpName("Sita Pandey");
        emp1.setEmpAddress("Texas");
        emp1.setEmpSalary(123);

        //create object of employee
        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setEmpName("Gira Pandey");
        emp2.setEmpAddress("St. Louis");
        emp2.setEmpSalary(345);

        employeesObjArray[0] = emp1;
        employeesObjArray[1] = emp2;

        //call array of employee object
        important.showEmplos(employeesObjArray);

        //create list of Employee object
        List<Employee> emplList = new ArrayList<>();
        emplList.add(emp2);
        emplList.add(emp1);

        //call the list of sortEmployees method
        important.sortEmployee(emplList);
    }

}
