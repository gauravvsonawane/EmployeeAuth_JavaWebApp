package com.fetch.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.employee.Employee;

public class FetchDao {

	public ArrayList<Employee> check(String empid)
	{
		 	String emp_id = null;
		    String fname= null;
		    String lname= null;
		    String dob= null;
		    String cno= null;
		    String job= null;
		    String msal= null;
		    String ybonus= null;
		ArrayList<Employee> Employees = new ArrayList<Employee>();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","manager");  
			      
			PreparedStatement ps=con.prepareStatement(  
			"select * from gaurav_111915036_detail where emp_id=?");  
			ps.setString(1,empid);  
			ResultSet rs=ps.executeQuery();  
			
			while(rs.next())
			{
				emp_id = rs.getString(1);
				fname = rs.getString(3);
				lname = rs.getString(4);
				dob = rs.getString(5);
				cno = rs.getString(6);
//				Employees.add(new Employee(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), "0"));
			}
			
			
			ps=con.prepareStatement(  
					"select * from gaurav_111915036_salary where emp_id=?");  
					ps.setString(1,empid);  
					ResultSet rs2=ps.executeQuery();  
					
					while(rs2.next())
					{
						job = rs2.getString(2);
						msal = rs2.getString(3);
						ybonus = rs2.getString(4);
//						Employees.add(new Employee(rs.getString(1), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), "0"));
					}
					
					System.out.println(emp_id+" "+fname+" "+lname+" "+dob+" "+cno+" "+job+" "+msal+" "+ybonus);
					Employees.add(new Employee(emp_id, fname, lname, dob, cno, job, msal, ybonus));
			
		} catch (Exception e) { 
			e.printStackTrace();
			
		}
		return Employees;
	}
}