<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <script type="text/javascript" src='<c:url value="/JS/validate.js"/>'  >
</script> --%>

<h1 style="color:red;text-align: center;">Patient Registration Form</h1>
<form:form method="POST" commandName="patientCMD" onsubmit="return validate(this)">
	
	Patient Name::<form:input path="pname" /><span class="error"></span><form:errors path="pname" cssClass="error"/><br>
	Patient Address::<form:input path="padd" /><span class="error"></span><form:errors path="padd" cssClass="error"/><br>
	patient disease::<form:input path="disease"/><span class="error"></span><form:errors path="disease" cssClass="error"/><br>
	Tretment By Doctor::<form:input path="doctors"/><span class="error"></span><form:errors path="doctors" cssClass="error"/><br>
	<%-- Registration Date::<form:input  path="regeistrationdate" type="date"/><span class="error"></span><form:errors path="regeistrationdate" cssClass="error"/><br> --%>
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