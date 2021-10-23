package com.torryharris.files;



import com.torryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class DeserializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream("employee.txt");
        ObjectInputStream employeeObjectInputStream=new ObjectInputStream(fis);
       Employee employee;
        ArrayList<Employee>employeeArrayList=new ArrayList<>();
        //ArrayList<Employee>employeeArrayList=null;
        try {
            while (true) {
               employee = (Employee) employeeObjectInputStream.readObject();
               employeeArrayList.add(employee);
               //employeeArrayList=(ArrayList<Employee>) employeeObjectInputStream.readObject();
            }
        }catch (EOFException ex) {
        }

        System.out.println("Employee Details are:");
        for(Employee e:employeeArrayList) {
            System.out.println(e);
        }
        employeeArrayList.sort(null);
        System.out.println();
        System.out.println("Sorted o|p based on personid");

        for(Employee e:employeeArrayList) {
            System.out.println(e);
        }

        }
    }

