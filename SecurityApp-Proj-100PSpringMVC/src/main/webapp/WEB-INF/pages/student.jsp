<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
	<h1>Student Page</h1>
	Logged Username::<%=request.getUserPrincipal().getName() %>
	<a href="home.htm">Home</a>