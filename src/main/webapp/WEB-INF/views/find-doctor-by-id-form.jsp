<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Doctor By Id</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="get" modelAttribute="findDoctorById">
				<div>
					<label for="doctor_id">Doctor Id</label>
					<div>
						<form:input path="doctor_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="name">Name</label>
					<div>
						<form:input path="name" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="dob">Dob</label>
					<div>
						<form:input path="dob" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="speciality">Speciality</label>
					<div>
						<form:input path="speciality" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="city">City</label>
					<div>
						<form:input path="city" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="phone_No">Phone No</label>
					<div>
						<form:input path="phone_No" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="standard_fees">Standard Fees</label>
					<div>
						<form:input path="standard_fees" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>