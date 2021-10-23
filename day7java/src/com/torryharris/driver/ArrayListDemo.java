package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        Employee e1 = new Employee(1234, "Ram", "Manager", 50000);
        Employee e2 = new Employee(5678, "Raj", "Clerk", 20000);
        Employee e3 = new Employee(9101,"Radha","Lead",40000);
        Employee e4 = new Employee(1121,"Akbar","Engineer",30000);
        Employee e5 = new Employee(3141,"Birbal","Director",60000);
        Employee e6 = new Employee(4151,"Rani","Watchmen",15000);
        ArrayList<Employee>empList=new ArrayList<>();
        System.out.println("before adding details");
        if(empList.isEmpty())
        {
            System.out.println("Employee list is empty");
        }
        empList.add(e1);
        empList.add(e2);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);
        System.out.println(empList);
        empList.add(1,e3);
        System.out.println("--------Employee List----------");
       /* for(int i=0;i<empList.size();i++)
        {
            System.out.println(empList.get(i));
        }
        for(Employee emp:empList)
        {
            System.out.println(emp);
        }*/
        Iterator<Employee>employeeIterator=empList.iterator();
        System.out.println("using iterator method----------");
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }
        System.out.println("---done-------");
        System.out.println("After Sorting");
        empList.sort(null);
        employeeIterator=empList.iterator();
        while(employeeIterator.hasNext())
        {
            System.out.println(employeeIterator.next());
        }


    }
}
