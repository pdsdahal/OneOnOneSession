package com.automationsession.july3;

import java.util.Comparator;

public class SortbyID implements Comparator<Employee> {

    public int compare(Employee first, Employee second)
    {
        return first.getEmpId() - second.getEmpId();
    }
}