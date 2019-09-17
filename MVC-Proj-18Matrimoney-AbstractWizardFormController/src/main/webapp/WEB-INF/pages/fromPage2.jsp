<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <body style="background: antiquewhite;">
  <form:form method="POST" commandName="mtCmd">
  	<table style="margin:auto;">
  		<tr><th>Professional Details</th></tr>
  		<tr>
  			<td>Designation</td>
  			<td><form:input path="Desg"/></td>
  		</tr>
  		<tr>
  			<td>Qualification</td>
  			<td><form:select path="qlfctn" ><form:options items="${Qualification }"/></form:select></td>
  		</tr>
  		<tr>
  			<td>Salary</td>
  			<td><form:input path="salary"/></td>
  		</tr>
  		
  		
  		<tr>
  			<td colspan="2">
  				<input type="submit" value="Back" name="_target0">
  				<input type="submit" value="next" name="_target2">
  			</td>
  		</tr>
  	</table>
  </form:form>
  </body>
  