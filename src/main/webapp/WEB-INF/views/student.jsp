<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<form:form method="POST" action="/student" modelAttribute="stud" enctype="multipart/form-data" >
				<table>
        			<tr>
        				<td>Id</td>
        				<td><form:input type="text" path="id"></form:input></td>
        			</tr>
        			<tr>
        				<td>Email</td>
        				<td><form:input type="text" path="email"></form:input> </td>
        			</tr>
        			<tr>
        				<td>password</td>
        					<td><form:input type="text" path="password"></form:input> </td>
        			</tr>
        			<tr>
        				<td colspan=2><input type="submit" value="Save"> </td>
        			</tr>
        		</table>
			</form:form>
</div>

</body>
</html>