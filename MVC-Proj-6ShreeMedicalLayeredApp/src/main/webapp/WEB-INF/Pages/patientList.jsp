<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <c:choose>
  	<c:when test="${!empty PDResult }">
  		<table border="1">
  			<tr><th>ID</th> <th>Patient</th> <th>Address</th> <th>Disease</th> <th>Doctor</th> <th>Date</th></tr>
  		
  		<c:forEach var="patientData" items="${PDResult}">
  			<tr>
  				<td>${patientData.id}</td>
  				<td>${patientData.pname}</td>
  				<td>${patientData.padd}</td>
  				<td>${patientData.disease}</td>
  				<td>${patientData.doctoConstlnt}</td>
  				<td>${patientData.registrationDateAndTime}</td>
  				
  			</tr>
  		</c:forEach>
  		
  		</table>
  	</c:when>
  </c:choose>
