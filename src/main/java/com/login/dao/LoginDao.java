package com.login.dao;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;


public class LoginDao {

	public boolean check(String empid, String pass)
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
			      
			PreparedStatement ps=con.prepareStatement(  
			"select * from gaurav_111915036_detail where emp_id=? and password=?");  
			ps.setString(1,empid);  
			ps.setString(2,pass);  
			ResultSet rs=ps.executeQuery();  
			
			if(rs.next())
			{
				return true;
			}
		} catch (Exception e) { 
			e.printStackTrace();
			
		}
		return false;
	}
}