<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="index.jsp">Home</a>
	<h1>Welcome ,${email}</h1>
	<h2>Address Sent Succesfully</h2>
	<form action="AttachAddress" method="post">
		<div>
			<label>BuildingNo</label> <input type="text" placeholder="Number"
				name="number"> <label>State</label> <input type="text"
				placeholder="State" name="state">
		</div>
		<div>
			<label>Street</label> <input type="text"
				placeholder="Enter The State" name="street"> <label>Country</label>
			<input type="text" placeholder="Country">
		</div>
		<div>
			<label>City </label> <input type="text" placeholder="Enter The City"
				name="city">
		</div>
		<input type="submit" placeholder="save">


	</form>
</body>
</html>