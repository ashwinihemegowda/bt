package com.torryharris.jdbc;

import com.torryharris.model.Insurance;

import java.sql.*;
import java.util.ArrayList;

public class InsuranceJdbcDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/company";
            String username="root";
            String password="ashu@2611";
            Connection connection= DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            System.out.println("Connected to DB successfully");
            Statement statement=connection.createStatement();

            //String query="select * from insurance
            //String query="select * from insurance where ins_type='HEALTH'";
            //String query="select * from insurance where sum>300000";
            //String query="select * from insurance order by ins_id";
            //String query="select ins_name,ins_id,120/100*sum as sum,ins_type from insurance";
//            String query="select * from insurance";
//            ResultSet resultSet=statement.executeQuery(query);
//            System.out.println("Insurance details are");
//            System.out.println("----------------------------------");
//            while(resultSet.next())
//            {
//                String insName= resultSet.getString("ins_name");
//                int insId= resultSet.getInt("ins_id");
//                int sum=resultSet.getInt("sum");
//                String insType= resultSet.getString("ins_type");
//                Insurance insurance=new Insurance(insName,insId,sum,insType);
//                System.out.println(insurance);
//            }
//            ArrayList<Insurance>insuranceArrayList=getInsurance();
//            for(Insurance i:insuranceArrayList)
//            {
//                String insertQuery="insert into insurance values('"+i.getInsName()+"',"+i.getInsID()+
//                        ","+i.getSum()+",'"+i.getInsType()+"')";
//                System.out.println((insertQuery));
//                statement.execute(insertQuery);
//            }
            System.out.println("Inserting values into insurance is successfull");
            statement.close();
            connection.close();


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();



        }


    }
    public static ArrayList<Insurance> getInsurance()
    {
        Insurance i1=new Insurance("HDFC",15001,300000,"HEALTH");
        Insurance i2=new Insurance("LIC",16001,400000,"Gold");
        Insurance i3=new Insurance("SBI",17001,500000,"House");
        Insurance i4=new Insurance("MUTHOOT",18001,300000,"Medical");
        Insurance i5=new Insurance("HDFC",15001,30000,"HEALTH");
        Insurance i6=new Insurance("KARNATAKA",19001,50000,"Education");
        ArrayList<Insurance>arrayList=new ArrayList<>();
        arrayList.add(i1);
        arrayList.add(i2);
        arrayList.add(i3);
        arrayList.add(i4);
        arrayList.add(i5);
        arrayList.add(i6);
        return arrayList;
    }

}
