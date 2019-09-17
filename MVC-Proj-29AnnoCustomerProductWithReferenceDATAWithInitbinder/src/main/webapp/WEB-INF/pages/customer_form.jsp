<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <form:form method="POST" modelAttribute="cmd">
    	<table>
    		<tr><th>Customer-Details</th></tr>
    		<tr>
    			<td>Name</td>
    			<td><form:input path="name" /></td>
    			<td><form:errors path="name" /></td>
    		</tr>
    		<tr>
    			<td>Address</td>
    			<td><form:input path="address" /></td>
    			<td><form:errors path="address"/></td>
    		</tr>
    		<tr>
    			<td>Gender</td>
    			<td><form:radiobuttons path="gender" items="${genderList}"/></td>
    		</tr>
    		<tr>
    			<td>Country</td>
    			<td>
    				<form:select path="country">
    					<form:options items="${countryList}"/>
    				</form:select>
    			</td>
    		</tr>
    		<tr>
    			<td>Products</td>
    			<td>
    				<form:select path="product" multiple="multiple">
    					<form:options items="${productList }"/>
    				</form:select>
    			</td>
    		</tr>
    		<tr>
    			<td>Delivery Date</td>
    			<td>
    				<form:input path="dlvrdate" />
    			</td>
    		</tr>
    		<tr>
    			
    			<td colspan="2">
    				<input type="submit" value="Submit">
    			</td>
    		</tr>
    	</table>
    </form:form>
    
   <!-- Customer Details --> 
   <h1>Customer Details</h1>
   ${cmdData}