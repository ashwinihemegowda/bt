package com.torryharris.driver;

public class ExceptionDemo {
    public static void main(String[] args) {
        try{
        String s=null;
            System.out.println("hello1");
        System.out.println(s.length());
            int[] array = new int[4];
            array[4] = 10;
        int a=3,b=0;
        int c=a/b;
            System.out.println("hello2");
        System.out.println(c);
        }catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught");
            ex.printStackTrace();
        }
        catch(NullPointerException ex)
        {
            System.out.println("Exception caught");
            ex.printStackTrace();
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Exception caught");
            ex.printStackTrace();
        }
        System.out.println("hello3");
    }
}
