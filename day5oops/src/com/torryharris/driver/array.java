package com.torryharris.driver;

public class array {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        int c=a/b;
        if (b < 0) {
            throw new ArithmeticException("Negative error");
        } else
            System.out.println("sum is "+a/b);
        System.out.println("hello1");
    }
}



