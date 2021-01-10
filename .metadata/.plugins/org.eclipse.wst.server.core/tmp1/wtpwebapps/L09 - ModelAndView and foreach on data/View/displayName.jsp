<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Name view</title>
</head>
<body>
	Today is : ${date}
	<br /> Hello ${name}
	<br /> List of names: ${ournames}
	
	<c:forEach var="temp" items="${ournames}">
	<br/>${temp}
	
	</c:forEach>
</body>
</html>