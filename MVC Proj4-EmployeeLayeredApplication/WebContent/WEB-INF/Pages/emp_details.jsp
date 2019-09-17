<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Employee Details</h1>
<c:choose>
	<c:when test="${!empty employee_Details }">
	<table border="1">
		<tr style="text-align: center; background-color: red;color:#ffff;"><th>EmployeeLists</th></tr>
			<tr>
				<th>NO</th>
				<th>Name</th>
				<th>BasicSalary</th>
				<th>GrossSalary</th>
				<th>NetSalary</th>
				</tr>
		<c:forEach var="empList" items="${employee_Details}">
				<tr>
					<td>${empList.employeeNo }</td>
					<td>${empList.employeeName }</td>
					<td>${empList.empBasicSal }</td>
					<td>${empList.empNetSal }</td>
					<td>${empList.empgrossSal }</td>
				</tr>
			
		</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1>Records Not Found</h1>
	</c:otherwise>
</c:choose>
<a href="home.htm">Home</a>