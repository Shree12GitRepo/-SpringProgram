<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>${label}</h1>
<c:choose>
	<c:when test="${!empty localeList}">
		<c:forEach items="${localeList}" var="res">
			
			${localeList}
		</c:forEach>
	</c:when>
	<c:otherwise>
		<h1>OOPs...you Are getting Problem</h1>
	</c:otherwise>
</c:choose>