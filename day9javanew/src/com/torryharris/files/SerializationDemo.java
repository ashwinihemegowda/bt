package com.torryharris.files;

import com.torryharris.model.Employee;

import java.io.*;
import java.util.ArrayList;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {
        Employee e1 = new Employee(1001, "Ram", "lead", 50000);
        Employee e2 = new Employee(1003, "Raj", "manager", 60000);
        Employee e3 = new Employee(1004, "sam", "clerk", 80000);
        Employee e4 = new Employee(1002, "bam", "CEO", 90000);
        FileOutputStream fos = new FileOutputStream("employee.txt");
        ObjectOutputStream employeeObjectOutputStream = new ObjectOutputStream(fos);
       //ArrayList<Employee>employeeArrayList=new ArrayList<>();
       //employeeObjectOutputStream.writeObject(employeeArrayList);
       employeeObjectOutputStream.writeObject(e1);
        employeeObjectOutputStream.writeObject(e2);
        employeeObjectOutputStream.writeObject(e3);
        employeeObjectOutputStream.writeObject(e4);
        employeeObjectOutputStream.flush();
        employeeObjectOutputStream.close();
        fos.close();


    }
}
