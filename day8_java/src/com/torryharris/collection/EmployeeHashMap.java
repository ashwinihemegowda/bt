package com.torryharris.collection;

import com.torryharris.model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {
    public static void main(String[] args) {
        Employee e1 = new Employee(1234, "Ram", "Manager", 50000);
        Employee e2 = new Employee(5678, "Raj", "Clerk", 20000);
        Employee e3 = new Employee(9101,"Radha","Lead",40000);
        Employee e4 = new Employee(1121,"Akbar","Engineer",30000);
        Employee e5 = new Employee(3141,"Birbal","Director",60000);
        Employee e6 = new Employee(4151,"Rani","Watchmen",15000);
        HashMap<Integer,Employee>employeeHashMap=new HashMap<>();
        employeeHashMap.put(e1.getEmpId(),e1);
        employeeHashMap.put(e2.getEmpId(),e2);
        employeeHashMap.put(e3.getEmpId(),e3);
        employeeHashMap.put(e4.getEmpId(),e4);
        System.out.println(employeeHashMap);
        HashMap<Employee,Integer>integerHashMap=new HashMap<>();
        integerHashMap.put(e1,e1.getEmpId());
        integerHashMap.put(e2,e2.getEmpId());
        integerHashMap.put(e3,e3.getEmpId());
        integerHashMap.put(e4,e4.getEmpId());
        System.out.println(integerHashMap);

    }
}
