package com.torryharris.driver;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        try {
            if (c == 0) {
                throw new ArithmeticException("Custom message:Divide by zero error");
            } else {
                a = b / c;
            }
        }catch(ArithmeticException ex) {
            System.out.println("Exception caught");
            System.out.println(ex);
        }
        System.out.println("After if-else statement a="+a);
        }
    }

