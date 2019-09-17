<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
	<title><spring:message code="reg.title" /></title>
</head>
<form:form method="POST" modelAttribute="cmd">
	<spring:message code="reg.eid"/><form:input path="id"/>
	<spring:message code="reg.ename"/><form:input path="name"/>
	<spring:message code="reg.eaddrs"/><form:input path="addrs"/>
	<spring:message code="reg.esal"/><form:input path="salary"/>
	<input type="submit" value="Register">
</form:form>
<label>Choose Your Language</label>
<a href="?lang=hi_IN">Hindi</a>
<a href="?lang=ch_CH">China</a>
<a href="?lang=en_US">English</a>