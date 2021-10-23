package com.torryharris.files;

import java.io.*;

public class FileReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        File input=new File("input.txt");
        FileReader reader=new FileReader(input);
        char [] array=new char[(int)input.length()];
        reader.read(array);
        String Data = new String(array);
        System.out.println(Data);
        reader.close();
        Data="This is contents of output file using FileWriter Object";
        FileWriter writer=new FileWriter("output2.txt");
        writer.flush();
        writer.close();


    }

}
