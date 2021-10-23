package com.torryharris.jdbc;

import com.torryharris.model.Book;

import java.sql.*;

public class BookJDBCDemo {
    static Connection connection;
    static Savepoint savepoint;
    public static void main(String[] args) throws SQLException {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/company";
            String username="root";
            String password="ashu@2611";
            connection= DriverManager.getConnection(url,username,password);
            connection.setAutoCommit(false);
            System.out.println("connected to DB successfully");
            Statement statement=connection.createStatement();
            Book book=new Book(100,"oracle",200);
            Book book1=new Book(101,"mysql",300);
            String q1="update book set book_price=400 where book_name='oracle'";
            System.out.println(q1);
            statement.execute(q1);
            savepoint=connection.setSavepoint("savepoint1");
            System.out.println("query1 is success");
            String q2="insert into book values (105,'java',600)";
            System.out.println(q2);
            statement.execute(q2);
            System.out.println("query2 is success");
            String q3="insert into book values ('107',book,270)";
            System.out.println(q3);
            statement.execute(q3);
            System.out.println("query3 is success");
            connection.commit();
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Transaction failed");
            connection.rollback(savepoint);
            connection.commit();
            System.out.println("transaction rolled back to savepoint1.....");
            e.printStackTrace();
        }
    }
}
