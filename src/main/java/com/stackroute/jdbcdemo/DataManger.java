package com.stackroute.jdbcdemo;

import java.sql.*;

public class DataManger {
public void getAllStudent()
{
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentInfo","root","Root@123");
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from course");
        while (resultSet.next())
        {
            int id=resultSet.getInt(1);
            System.out.println("id is  " +id);
        }

    }
    catch (ClassNotFoundException e) {
        System.out.println("exception is "+e.getStackTrace());
    }
    catch (SQLException sqlexception)
    {
        System.out.println("exception is "+sqlexception.getStackTrace());
    }
}



}