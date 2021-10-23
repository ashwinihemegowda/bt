package com.torryharris.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileActivity {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name=sc.nextLine();
        System.out.println("enter number");
        int num=sc.nextInt();

        FileWriter writer=new FileWriter("Out.txt");
        for(int i=0;i<num;i++) {
           writer.write(name);
           writer.write("\n");
        }

        writer.flush();
        writer.close();

    }
}
