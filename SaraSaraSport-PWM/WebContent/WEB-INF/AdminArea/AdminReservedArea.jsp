<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Admin reserved area</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<%@ include file="../Header.jsp"%>
</head>
<body onLoad="attivacampi('adminreservedarea')">
	<div id="wrapper">




		<div class="container">
			<h2>Personal details</h2>
			<style>
h2 {
	text-align: center;
}
</style>

			<table class="table">

				<tbody>
					<tr>
						<td>ID</td>
						<td class="tab_admin"><s:property
								value="admin.idAdmin" /></td>
					</tr>
					<tr>
						<td>Name</td>
						<td class="tab_admin"><s:property value="admin.name" /></td>

					</tr>
					<tr>
						<td>Surname</td>
						<td class="tab_admin"><s:property
								value="admin.surname" /></td>

					</tr>
					<tr>
						<td>Username</td>
						<td class="tab_admin"><s:property
								value="admin.username" /></td>

					</tr>
					<tr>
						<td>Password</td>
						<td class="tab_admin"><s:property
								value="admin.password" /></td>

					</tr>
					<tr>
						<td>Email</td>
						<td class="tab_admin"><s:property
								value="admin.email" /></td>

					</tr>
				</tbody>
			</table>

		</div>
	</div>
</body>
</html>


<%@ include file="../Footer.jsp"%>

</body>
</html>