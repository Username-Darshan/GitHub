<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{
	background-color: #f2f2f2;
}
</style>
</head>
<body>
	<div align="center">
		<fieldset>
			<legend>Create Admin Account</legend>
			<form action="./createaccount" method="post">
				<table>
					<tr>
						<td>Username</td>
						<td><input type="text" name="username"></td>
					</tr>
					<tr>
						<td>Password</td>
						<td><input type="password" name="password"></td>
					</tr>
				</table>
				<input type="submit" value="CREATE ACCOUNT">
			</form>
		</fieldset>
	</div>
</body>
</html>