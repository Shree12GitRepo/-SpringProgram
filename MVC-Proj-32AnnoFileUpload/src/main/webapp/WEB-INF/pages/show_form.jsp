<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Uplaod Form</title>
</head>
<body>
	<form:form method="POST" modelAttribute="upldCmd" enctype="multipart/form-data">
		<label>Select File1</label><input type="file" value="choose file" name="file1"><br><br>
		<label>Select File2</label><input type="file" value="choose file" name="file2">	<br>
		<input type="submit" value="Upload">
	</form:form>
	${file1}${file2} 
	${uplderr}
</body>
</html>