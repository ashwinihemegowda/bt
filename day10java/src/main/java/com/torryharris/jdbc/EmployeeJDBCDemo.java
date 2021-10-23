package com.torryharris.jdbc;

import com.torryharris.model.Employee;

import java.sql.*;
import java.util.ArrayList;

public class EmployeeJDBCDemo {
    public static void main(String[] args) {
            try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/company";
            String userName = "root";
            String password = "ashu@2611";

            Connection connection = DriverManager.getConnection(url, userName, password);
            System.out.println("Connected to DB successfully");
            Statement statement = connection.createStatement();
            ArrayList<Employee>employees=getEmployees();
            insertUsingPreparedStatement(connection,employees);
//            String createQuery = "create table book(book_id int ,book_name varchar(20),book_price int)";
//                System.out.println("create table");
//                System.out.println(createQuery);
//                statement.execute(createQuery) ;
                System.out.println("table created successfully");
//          String query="select * from employee";
//          ResultSet resultSet=statement.executeQuery(query);
//            System.out.println("Employee Details are:");
//            System.out.println("-----------------------------");
//            while(resultSet.next())
//            {
//                int empId= resultSet.getInt("employee_id");
//                String name=resultSet.getString("name");
//                String designation=resultSet.getString("designation");
//                float salary=resultSet.getFloat("salary");
//                int yearOfJoining= resultSet.getInt("year_of_joining");
//                Employee employee=new Employee(empId,name,designation,salary,yearOfJoining);
//                System.out.println(employee);
//            }
//            String updateQuery="update employee set designation='Architect' where year_of_joining=2017";
//            System.out.println(updateQuery);
//            int rowsAffected=statement.executeUpdate(updateQuery);
//            System.out.println("Table updated successfullu");
//            System.out.println("no. of rows affected:"+rowsAffected);
//            Employee e1=new Employee(1001,"Ram","Manager",50000f,2015);
//            Employee e2=new Employee(1002,"Rahim","Clerk",20000f,2017);
//            ArrayList<Employee> employeeArrayList = getEmployees();
//            for (Employee e : employeeArrayList) {
//                String insertQuery = "insert into employee values(" + e.getEmployeeId() + ",'" + e.getName() + "','" + e.getDesignation()
//                        + "'," + e.getSalary() + "," + e.getYearOfJoining() + ")";
//                System.out.println(insertQuery);
//                statement.execute(insertQuery);
//            }
//            System.out.println("Inserted the values successfully");
            statement.close();
            connection.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public static ArrayList<Employee> getEmployees() {
        Employee e1 = new Employee(1003, "Ashu", "Engineer", 50000f, 2015);
        Employee e2 = new Employee(1004, "Rakshu", "CEO", 80000f, 2017);
        Employee e3 = new Employee(1005, "Siri", "Administrator", 60000f, 2013);
        Employee e4 = new Employee(1006, "Chiru", "Admin", 45000f, 2016);
        Employee e5 = new Employee(1007, "Bindhu", "Receptionist", 30000f, 2011);
        Employee e6 = new Employee(1008, "Sindhu", "Trainee", 20000f, 2015);
        ArrayList<Employee> employeeArrayList = new ArrayList<Employee>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);
        employeeArrayList.add(e3);
        employeeArrayList.add(e4);
        employeeArrayList.add(e5);
        employeeArrayList.add(e6);
        return employeeArrayList;
    }
    public static void insertUsingPreparedStatement(Connection connection,ArrayList<Employee> employees) throws SQLException {
         String pQuery="insert into employee values(?,?,?,?,?)";
         PreparedStatement preparedStatement=connection.prepareStatement(pQuery);
         for(Employee employee:employees)
         {
             preparedStatement.setInt(1,employee.getEmployeeId());
             preparedStatement.setString(2,employee.getName());
             preparedStatement.setString(3,employee.getDesignation());
             preparedStatement.setFloat(4,employee.getSalary());
             preparedStatement.setInt(5,employee.getYearOfJoining());
             preparedStatement.execute();
         }

    }
}