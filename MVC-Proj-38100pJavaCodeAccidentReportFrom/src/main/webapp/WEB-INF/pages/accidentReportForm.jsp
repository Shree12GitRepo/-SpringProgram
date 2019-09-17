<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Accident Report Form</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Accident Report Form</h2>
  <form:form  method="POST" modelAttribute="accdntFormCmd">
  	<div class="form-check-inline">
      <label class="form-check-label" for="check">
        <form:checkboxes items="${rprtngaccdList }" path="reportingAccident" class="form-check-input"/>
      </label>
    </div>
    <p>Person Reporting Incident</p>
    <div class="form-group">
      <label for="usr">First Name:</label>
      <form:input path="personReportingfirstName" class="form-control"/>
    </div>
    <div class="form-group">
      <label for="usr">Last Name:</label>
      <form:input path="personReportingfirstName" class="form-control"/>
    </div>
     <p>Person Involvement in Incident</p>
    <div class="form-group">
      <label for="usr">First Name:</label>
      <form:input path="personinvolvedInIncidentfirstNsme" class="form-control"/>
    </div>
    <div class="form-group">
      <label for="usr">Last Name:</label>
      <form:input path="personinvolvedInIncidentlastName" class="form-control"/>
    </div>
    
    <div class="form-group">
      <label for="usr">Incident Date and Time:</label>
      <form:input path="incidentDate" class="form-control" />
    </div>
    <div class="form-group">
      <label for="usr"></label>
      <form:input path="incidentTime" class="form-control" />
    </div>
    <div class="form-group">
      <label for="usr">Location of incident</label>
      <form:input path="locationOfIncident" class="form-control" />
    </div>
     <div class="form-group">
      <label for="usr">Please Describe Event in Details</label>
      <form:textarea path="event" class="form-control"/>
    </div>
    
    <div class="form-group">
      <label for="usr">Was Damaged Done To The Property</label>
      <form:radiobuttons items="${ dmgprprtList}" path="damageOfProperty"/>
    </div>
    <div class="form-group">
      <label for="usr">How many Hours were lost because of this Incident</label>
      <form:input path="fisrstAid" class="form-control"/>
    </div>
      <div class="form-group">
      <label for="usr">Could this incident been avoided</label>
      <form:radiobuttons path="avoidIncident" items="${avdincdntList }"/>
    </div>
    <div class="form-group">
      <label for="usr">I certify that the information I have provided is truthful to the best of my knowledge. </label>
      <form:input path="signature"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>
  
    
  
</div>

</body>
</html>
    