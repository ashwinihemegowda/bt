package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadingDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("input.txt");
        System.out.println("File contents are:");
        int ch;
        while((ch=fis.read())!=-1)
        {
            System.out.print((char)ch);
        }
        fis.close();
        FileOutputStream fos=new FileOutputStream("output.txt");
        String str="This is an output file. \n This contains data output.";
        char[] array=str.toCharArray();
        for(char c:array)
        {
            fos.write((int)c);
        }
        fos.close();
        System.out.println("Contents are written onto file:output.txt");

    }
}
