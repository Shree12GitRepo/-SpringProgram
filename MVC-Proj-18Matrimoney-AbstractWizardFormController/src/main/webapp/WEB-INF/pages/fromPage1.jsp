<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <body style="background: antiquewhite;">
  <form:form method="POST" commandName="mtCmd">
  	<table style="margin:auto;">
  		<tr><th>Personal Details</th></tr>
  		<tr>
  			<td>Name</td>
  			<td><form:input path="name"/></td>
  		</tr>
  		<tr>
  			<td>Address</td>
  			<td><form:input path="addr"/></td>
  		</tr>
  		<tr>
  			<td>Gender</td>
  			<td><form:radiobuttons path="gender" items="${genderList }"/></td>
  		</tr>
  		<tr>
  			<td>D.O.B</td>
  			<td><form:input path="dob"/></td>
  		</tr>
  		
  		<tr>
  			<td colspan="2"><input type="submit" value="next" name="_target1"></td>
  		</tr>
  	</table>
  </form:form>
  </body>
  