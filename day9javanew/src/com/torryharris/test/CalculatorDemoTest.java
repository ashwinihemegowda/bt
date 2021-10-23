package com.torryharris.test;

public class CalculatorDemoTest {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        System.out.println("2+3= "+calculator.add(2,3));
        System.out.println("5-3= "+calculator.sub(5,3));
        System.out.println("4*5= "+calculator.mul(4,5));
        System.out.println("8/3= "+calculator.div(8,3));
    }
}
