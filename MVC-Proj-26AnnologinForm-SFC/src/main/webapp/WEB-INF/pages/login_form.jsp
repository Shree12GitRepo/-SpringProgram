<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Login Application</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>

<h1 class="d-flex justify-content-center align-items-center" style="border-bottom: 2px solid palevioletred;">LogIn Form page</h1>
<div class="container d-flex justify-content-center align-items-center" >
  <form:form method="POST" modelAttribute="cmd">
    <div class="form-group">
      <label for="usr">Name:</label>
      <form:input path="username" cssClass="form-control"/>
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <form:password path="pwd" cssClass="form-control"/>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form:form>
</div>
	${login_msg}
</body>
</html>
