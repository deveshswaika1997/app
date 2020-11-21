<%@ page language="java" contentType="text/html; charset=ISO-8859-1"    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<spring:form action='custregister' method='post' modelAttribute="customer">

Username:  <spring:input path="name" name="name"/>  <br>

Password:  <spring:password path="password" name="password" /> <br>

Gender: 
Male: <spring:radiobutton path="gender" name="gender" value="M"/>
Female: <spring:radiobutton path="gender" name="gender" value="F"/> <br>

Hobby:
Cricket: <spring:checkbox path="hobbies" value="Circket"/>
Football: <spring:checkbox path="hobbies" value="Football"/>
Swimming: <spring:checkbox path="hobbies" value="Swimming"/> <br>

Location:
<spring:select path="location" items="${locationlist}" /> <br>  
<spring:button id="register" name="register">Register</spring:button>
</spring:form>
</body>
</html>