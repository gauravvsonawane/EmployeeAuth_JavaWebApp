package com.signup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SignupDao {
	
	public void pushToDB(String empid, String pass, String fname, String lname, String dob, String cno)
	{
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
			      
			PreparedStatement ps=con.prepareStatement(  
			"insert into gaurav_111915036_detail values('"+empid+"', '"+pass+"', '"+fname+"', '"+lname+"', '"+dob+"', '"+cno+"')");  
			  
			ResultSet rs=ps.executeQuery();  
	
		} catch (Exception e) { 
			e.printStackTrace();
			
		}
	}
}
