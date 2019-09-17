<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
  <form:form method="POST" modelAttribute="cusCmd">
  	Customer Number::<form:input path="accountnumber" />
  	<input type="submit" value="SBICustomer Details">
  </form:form>
  <br><br>
  <c:choose>
  	<c:when test="${!empty cusDTO }">
  		<table>
	  			<tr>
	  				<th>Name</th>
	  				<th>Account Number</th>
	  				<th>AccountType</th>
	  				<th>Balance</th>
	  			</tr>
  			
  				<tr>
  					<td>${cusDTO.accountnumber }</td>
  					<td>${cusDTO.name }</td>
  					<td>${cusDTO.acctType }</td>
  					<td>${cusDTO.balance }</td>
  				</tr>
  			
  		</table>
  	</c:when>
  	<%-- <c:otherwise>
  		<h1 style="color:red; text-align: center;">Records Not Found</h1>
  	</c:otherwise> --%>
  </c:choose>
  
  
  
  