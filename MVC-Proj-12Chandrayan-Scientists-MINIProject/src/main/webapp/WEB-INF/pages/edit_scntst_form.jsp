<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
   
 <body bgcolor="blue;">
 <form:form method="POST" commandName="scCMD">
 	<table style="margin: auto;color: aliceblue;font-size: 30px;">
 		<tr><th>Update The Scientists Records</th></tr>
 		<tr>
 			<td>ID</td>
 			<td><form:input path="id" disabled="true"/></td>
 		</tr>
 		<tr>
 			<td>Name</td>
 			<td><form:input path="name"/></td>
 		</tr>
 		<tr>
 			<td>Domain Name</td>
 			<td><form:input path="domainName"/></td>
 		</tr>
 		<tr>
 			<td>Experience</td>
 			<td><form:input path="experience"/></td>
 		</tr>
 		<tr>
 			<td>Petents</td>
 			<td><form:input path="petents"/></td>
 		</tr>
 		<tr>
 			<td colspan="2"><input type="submit" value="Update" style="margin-left: 30%;width: 200px;padding: 12px;border-radius: 10px;background: chocolate;color: currentColor;font-size: 20px;"></td>
 		</tr>
 	</table>
 </form:form>
 </body>