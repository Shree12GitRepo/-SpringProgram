<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
  <body style="background: antiquewhite;">
  <form:form method="POST" commandName="mtCmd">
  	<table style="margin:auto;">
  		<tr><th>Expection</th></tr>
  		<tr>
  			<td>Expected Desg</td>
  			<td><form:input path="expDesg"/></td>
  		</tr>
  		
  		<tr>
  			<td>Exp Age</td>
  			<td><form:input path="expAge"/></td>
  		</tr>
  		<tr>
  			<td>Expected Hobbies</td>
  			<td>
  				<form:select path="hobbies">
  					<form:options items="${hobbiesList }"/>
  				</form:select>
  			</td>
  		</tr>
  		
  		<tr>
  			<td colspan="2">
  				<input type="submit" value="Back" name="_target1">
  				<input type="submit" value="Submit" name="_finish">
  				<input type="submit" value="Cancel" name="_cancel">
  			</td>
  		</tr>
  	</table>
  </form:form>
  </body>
  