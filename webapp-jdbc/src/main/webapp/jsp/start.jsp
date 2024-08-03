<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Start</title>
		<link rel="stylesheet" href="css/style.css">
	</head>
	<body>
		<div class="main">
			<h1>Hello ${username}</h1>
			<h2>Task 4</h2>
			<h3>Simple Web-application with JDBC</h3>
			<p>This app displays a typical list of home devices, calculates power consumption, sorts the devices by power.</p>
			<br>
			<p>We are ready to start, fasten your seatbelt and push the button</p>
			<div>
				<button type="button" onclick='window.location.href="http://localhost:8080/webapp-jdbc/start"'>Start</button>
			</div>
		</div>
	</body>
</html>