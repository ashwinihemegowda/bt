package com.torryharris.driver;





import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingThrows {
    

    public static void main(String[] args) {
        try {
            readFromFile("input.txt");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static void readFromFile(String Filename)throws FileNotFoundException{
        File file=new File("input.txt");
            FileInputStream fi=new FileInputStream(file);
    }
}
