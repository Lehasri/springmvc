<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Doctor</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="deletedoc" method="post" modelAttribute="deletedoctor">
				<div>
					<label for="doctor_id">Doctor Id</label>
					<div>
						<form:input path="doctor_id" />
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