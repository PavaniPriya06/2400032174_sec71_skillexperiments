package com.klu.JdbcProject;
import java.sql.*;
public class App {
  public static void main(String[] args) {
    System.out.println("2400032174");
    try
    {
      //1. Load the driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      //2. Connection to DB
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/s71","root","welcome");
      //3. Statement object
         Statement stmt=con.createStatement();
      //4. Send the query
         String query="select * from Student";
         ResultSet rs=stmt.executeQuery(query);
      //5. Process the results
         while(rs.next())
         {
         int a=rs.getInt(1);
         String b=rs.getString(2);
         int c=rs.getInt(3);
         System.out.println(a+""+b+""+c);
         }
         
      //6. Terminate the connection
         con.close();
           
      
    }
    catch(Exception e)
    {
      System.out.println("Exception occurred");
    }
    
    
    
}
}