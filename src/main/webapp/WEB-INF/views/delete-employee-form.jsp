<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Employee</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="deleteemp" method="post" modelAttribute="deleteemployee">
				<div>
					<label for="emp_ID">Emp Id</label>
					<div>
						<form:input path="emp_ID" />
					</div>
				</div>
				
				<div>
					<form:button>Delete</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>