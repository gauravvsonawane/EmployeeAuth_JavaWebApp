<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.ArrayList"
 	import="com.employee.Employee"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body>

	<form action="Logout" class="nav navbar-dark bg-dark p-2 mb-3 m-1 rounded">
			<div class="navbar-brand mx-5">Results</div>
	</form>
	<div class="container my-3" align="center">
		<h2> Details for <u><i><%=request.getAttribute("empid")%></i></u> employee</h2>
	
		<table border ="1" width="1000" align="center" class="mt-5">
         <tr bgcolor="90CAF9">
          <th><b>Emp_Id</b></th>
          <th><b>Fname</b></th>
          <th><b>Lname</b></th>
          <th><b>DOB</b></th>
          <th><b>Contact</b></th>
          <th><b>Job role</b></th>
          <th><b>Monthly Salary</b></th>
          <th><b>Yearly Bonus</b></th>
          <th><b>Total Yearly Salary</b></th>
          <th><b></b></th>
         </tr>
        <%-- Fetching the attributes of the request object
             which was previously set by the servlet 
              "StudentServlet.java"
        --%> 
        <%ArrayList<Employee> Employees = 
            (ArrayList<Employee>)request.getAttribute("Employees");
        for(Employee student:Employees){%>
        <%-- Arranging data in tabular form
        --%>
            <tr>
                <td><%=student.getEmpid()%></td>
                <td><%=student.getFname()%></td>
                <td><%=student.getLname()%></td>
                <td><%=student.getDob()%></td>
                <td><%=student.getCno()%></td>
                <td><%=student.getJob()%></td>
                <td><%=student.getMsal()%></td>
                <td><%=student.getYbonus()%></td>
                <td><%=student.getTsal()%></td>
            </tr>
            <%}%>
        </table> 
  
	</div>
	
	            
	 	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
	 

</body>
</html>