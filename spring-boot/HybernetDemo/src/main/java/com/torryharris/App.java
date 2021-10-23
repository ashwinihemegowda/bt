package com.torryharris;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ){
        Alien telusko=new Alien();
        telusko.setAid(1001);
        telusko.setAname("navin");
        telusko.setColor("green");
        Configuration con=new Configuration();
        SessionFactory sf=con.buildSessionFactory();
        Session session=sf.openSession();
        session.save(telusko);


    }
}
