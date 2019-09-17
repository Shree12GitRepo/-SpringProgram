<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>\

<c:choose>
	<c:when test="${!empty insrtmsg }">
		<h1>${insrtmsg}</h1>
	</c:when>
	<c:otherwise>
		<h1>Internal problem</h1>
	</c:otherwise>
</c:choose>
   