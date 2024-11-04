<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Reserved Area</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body onLoad="attivacampi('customerarea')">
	<div id="wrapper">

<style>
h2 {
	text-align: center;
}
</style>

<div class="myDiv">
		<!--start: Wrapper -->
		<div id="wrapper">

			<%@ include file="../Header.jsp"%>
	
						

<section id="One" class="wrapper style3">
				<div class="inner">
					<header class="align-center">
						<p>SaraSaraSport</p>
						<h2>Customer reserved area</h2>
					</header>
				</div>
			</section>

			<table class="table">

				<tbody>
					<tr>
						<td>ID</td>
						<td class="tab_customer"><s:property
								value="customer.idCustomer" /></td>
					</tr>
					<tr>
						<td>Name</td>
						<td class="tab_customer"><s:property value="customer.name" /></td>

					</tr>
					<tr>
						<td>Surname</td>
						<td class="tab_customer"><s:property
								value="customer.surname" /></td>

					</tr>
					<tr>
						<td>Username</td>
						<td class="tab_customer"><s:property
								value="customer.username" /></td>

					</tr>
					<tr>
						<td>Password</td>
						<td class="tab_customer"><s:property
								value="customer.password" /></td>

					</tr>
					<tr>
						<td>Email</td>
						<td class="tab_customer"><s:property
								value="customer.email" /></td>

					</tr>
				</tbody>
			</table>

		</div>
	</div>
</div>
        
      

        
    <%@ include file="../Footer.jsp"%>
</body>
</html>