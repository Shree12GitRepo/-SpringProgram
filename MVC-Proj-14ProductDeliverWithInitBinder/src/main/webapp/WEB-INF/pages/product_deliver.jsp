<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <form:form method="POST" commandName="prodDelCMD">
    	<table>
    		<tr><th>Product Delivery Details</th></tr>
    		<tr>
    			<td>Product Name</td>
    			<td><form:input path="productName" /></td>
    			<td><form:errors path="productName" /></td>
    		</tr>
    		<tr>
    			<td>Company Name</td>
    			<td><form:input path="sourceCompanyname" disabled="true"/></td>
    			<td><form:errors path="sourceCompanyname"/></td>
    		</tr>
    		<tr>
    			<td>Client Company Name</td>
    			<td><form:input path="clientCompanyName" /></td>
    			<td><form:errors path="clientCompanyName"/></td>
    		</tr>
    		<tr>
    			<td>Delivery Date</td>
    			<td><form:input path="deliveryDate"/></td>
    			<%-- <td><form:input path="deliveryDate" type="date"/></td> --%>
    			<td><form:errors path="deliveryDate"/></td>
    		</tr>
    		<tr>
    			<td></td>
    			<td colspan="3"><input type="submit" value="Submit"/></td>
    			
    		</tr>
    	</table>
    </form:form>