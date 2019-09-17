<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<form method="post" action="cstmrform.htm">
	<table>
		<tr>
			<td>Customer Name</td>
			<td><input type="text" name="cname"></td>
		</tr><tr>
			<td>Customer Addres</td>
			<td><input type="text" name="cadd"></td>
		</tr>
		<tr>
			<td>Customer MobleNmber</td>
			<td><input type="text" name="cmob"></td>
		</tr>
		
		<tr >
			<td colspan="2">
				<input type="submit" value="insert" name="put">&nbsp;&nbsp;
				<input type="submit" value="update" name="change">&nbsp;&nbsp;
				<input type="submit" value="delete" name="erase">&nbsp;&nbsp;
				<input type="submit" value="view" name="show">
			</td>
			
		</tr>
		<tr>
			<td>
				<c:if test="${insertOperation ne null}">
					<c:out value="${insertOperation}"></c:out>
				</c:if>
				<c:if test="${UpdateOperation ne null }">
					<c:out value="${UpdateOperation }"></c:out>
				</c:if>
				<c:if test="${DeleteOperation ne null }">
					<c:out value="${DeleteOperation }"></c:out>
				</c:if>
			</td>
		</tr>
		
	</table>
</form>
	
