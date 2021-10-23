package com.torryharris.driver;

import com.torryharris.comparator.CollectionConstructor;
import com.torryharris.comparator.ImdbRatingComparator;
import com.torryharris.comparator.YearOfRelease;
import com.torryharris.model.Movie;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1=new Movie("Veeramadhakari",2011,12.53f,100f);
        Movie m2=new Movie("Sardara",2004,5.53f,10.5f);
        Movie m3=new Movie("Meravanige",2015,3.53f,20.3f);
        Movie m4=new Movie("KGF",2015,20.53f,500.3f);
        Movie m5=new Movie("Gentleman",2003,6.53f,8.5f);
        Movie m6=new Movie("Hosabelaku",1998,12.53f,50.4f);
        ArrayList<Movie>movieList=new ArrayList<>();
        movieList.add(m1);
        movieList.add(m2);
        movieList.add(m3);
        movieList.add(m4);
        movieList.add(m5);
        movieList.add(m6);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int i=sc.nextInt();
        switch(i)
        {
            case 1:
                movieList.sort(null);
                System.out.println("sorting based on title");
                for(Movie m:movieList)
                {
                    System.out.println(m);
                }
                break;
            case 2:
                movieList.sort(new YearOfRelease());
                System.out.println("sorting based of year of release");
                for(Movie m:movieList)
                {
                    System.out.println(m);
                }
                break;
            case 3:
                movieList.sort(new ImdbRatingComparator());
                System.out.println("sorting based on rating");
                for(Movie m:movieList)
                {
                    System.out.println(m);
                }
                break;
            case 4:
                movieList.sort(new CollectionConstructor());
                System.out.println("Sorting based on collections");
                for(Movie m:movieList)
                {
                    System.out.println(m);
                }
                break;
            default:
                System.out.println("Enter correct options 1-4");

        }
    }
}
