package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.GenericPrint;

public class GenericsDemo {
    public static void main(String[] args) {
        GenericPrint<Integer,Integer>iPrint=new GenericPrint<>(10,20);
        System.out.println(iPrint.getObj1()+" "+ iPrint.getObj2());
        GenericPrint<String,Boolean>strPrint=new GenericPrint<>("Hello",true);
        System.out.println(strPrint.getObj1()+" "+ strPrint.getObj2());
        GenericPrint<Float,Double>fPrint=new GenericPrint<>(10.67f,12.354678);
        System.out.println(fPrint.getObj1()+" "+ fPrint.getObj2());
        Employee emp=new Employee(1,"RAM","Engineer",50000);
        GenericPrint<Employee,String>empPrint=new GenericPrint<>(emp,"Good Background");
        System.out.println(empPrint.getObj1()+" "+empPrint.getObj2());
        //Generic methods
        genericDisplay(10);
        genericDisplay(emp);
        genericDisplay(23.567f);

    }
    static <T> void genericDisplay(T obj)
    {
        System.out.println(obj);
    }
}
