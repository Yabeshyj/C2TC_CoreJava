package com.TNSIF.C2TC.MiniProject.EmployeeManagement;

import java.sql.*;
public class DBConnection 
{
   public static Connection getConnection() throws SQLException
   {
	 String url = "jdbc:mysql://localhost:3306/employee_db";
     String userName = "root";
   	 String password = "2003";
   	 Connection con = DriverManager.getConnection(url, userName, password);
     return con;
   }
}
