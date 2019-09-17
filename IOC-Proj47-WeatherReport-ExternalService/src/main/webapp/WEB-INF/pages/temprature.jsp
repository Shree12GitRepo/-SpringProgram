<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

   <%
   		
   		%><p>Hyderabad Temprature::-</p>
   	<%
   		ServletContext sc=request.getServletContext();
   		float temp=(float)sc.getAttribute("temprature");
   		DecimalFormat format= new DecimalFormat("#.##");
   		float temprature=Float.valueOf(format.format(temp));
   		out.println(temprature+" C");
   %>
   