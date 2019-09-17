<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="color:red;text-align: center;">Patient Registration Form</h1>
<form:form method="POST" commandName="patientCMD">
	
	Patient Name::<form:input path="pname"/><form:errors path="pname" cssClass="error"/><br>
	Patient Address::<form:input path="padd"/><form:errors path="padd" cssClass="error"/><br>
	patient disease::<form:input path="disease"/><form:errors path="disease" cssClass="error"/><br>
	Tretment By Doctor::<form:input path="doctors"/><form:errors path="doctors" cssClass="error"/><br>
	Registration Date::<form:input  path="regeistrationdate" type="date"/><form:errors path="regeistrationdate" cssClass="error"/><br>
	<input type="submit" value="Register"/>
	
</form:form>
<!-- Style Shet -->
	<style>
		.error{
				color:red;
				font-size:15px;
				font-family: sans-serif;
			}
	</style>
<!-- Style Shet -->