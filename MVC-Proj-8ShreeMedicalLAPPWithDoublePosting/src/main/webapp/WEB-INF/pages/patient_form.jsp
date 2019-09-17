<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1 style="color:red;text-align: center;">Patient Registration Form</h1>
<form:form method="POST" commandName="patientCMD">
	Patient Name::<form:input path="pname"/><br>
	Patient Address::<form:input path="padd"/><br>
	patient disease::<form:input path="disease"/><br>
	Tretment By Doctor::<form:input path="doctors"/><br>
	Registration Date::<form:input path="regeistrationdate"/><br>
	<input type="submit" value="Register"/>
	
</form:form>