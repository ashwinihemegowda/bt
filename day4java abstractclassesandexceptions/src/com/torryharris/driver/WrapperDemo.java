package com.torryharris.driver;

import java.util.Scanner;

public class WrapperDemo {
    public static void main(String[] args) {
       /* int a=10;
        Integer iObj=a;
        int b=iObj;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the integer string");
        String a1=sc.next();
        System.out.println("Enter the float string");
        String a2=sc.next();
        int x=Integer.parseInt(a1);
        float y=Float.parseFloat(a2);
        System.out.println("x:"+x*2);
        System.out.println("y:"+y*2);*/
        int num=10;
        Integer obj=num;
        Integer add=obj+10;
        Integer sub=obj-10;
        Integer mul=obj*10;
        Integer div=obj/10;
        System.out.println("operations on int");
        System.out.println("sum="+add);
        System.out.println("Diff="+sub);
        System.out.println("Product="+mul);
        System.out.println("Quotient="+div);
        float f=10.5f;
        Float obj1=f;
        Float add1=obj1+10;
        Float sub1=obj1-10;
        Float mul1=obj1*10;
        Float div1=obj1/10;
        System.out.println("operations on FLOAT");
        System.out.println("sum="+add1);
        System.out.println("Diff="+sub1);
        System.out.println("Product="+mul1);
        System.out.println("Quotient="+div1);





    }
}
