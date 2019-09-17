<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <h1>WellCome To Student Page</h1>
    
     Logged username :: <%=request.getUserPrincipal().getName() %>
     <br><br> 
   <a href="../index.jsp">home</a>
   &nbsp;&nbsp;
   <a href="../logout">logout</a>