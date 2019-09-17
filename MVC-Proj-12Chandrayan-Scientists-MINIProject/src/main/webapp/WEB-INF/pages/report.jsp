<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<body bgcolor="Blue">
		<h1 style="text-align:center;">Scientists Details..</h1>
		<c:choose>
			<c:when test="${!empty liDTO }">
				<table border="1" style="margin: auto;background: aliceblue;">
					<tr><th>ID</th><th>Name</th><th>Domain</th><th>Experience</th><th>Petenets</th><th>Edit/Delete</th></tr>
					<c:forEach var="dto" items="${liDTO}">
						<tr>
							<td>${dto.id}</td>
							<td>${dto.name}</td>
							<td>${dto.domainName}</td>
							<td>${dto.experience}</td>
							<td>${dto.petents}</td>
							<td>
								<a href="edit.htm?id=${dto.id }"><img src="images/edit.png" style="width:15%;height:15%;"></a>
								<a href="delete.htm?id=${dto.id }"><img src="images/delete.png" style="width:15%;height:15%;margin-left: 12%;"></a>
								
							</td>
						</tr>
					</c:forEach>
					
				</table>
			</c:when>
			<c:otherwise>
				<h1 style="color:red; text-align: center;">Records Not Found</h1>
			</c:otherwise>
		</c:choose>
		
</body>

