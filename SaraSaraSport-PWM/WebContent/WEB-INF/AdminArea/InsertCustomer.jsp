<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.customer.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Customer</title>
</head>
<body onLoad="attivacampi('customerarea')">
	<div id="wrapper">

		<%@ include file="../Header.jsp"%>

		<div class="container">
			<h4 align="left">Insert Customer</h4>
			<div class="divform" align="left">
				<div style="background-color: #01bafd;">
					<s:actionerror />
				</div>
				<s:form action="InsertCustomer" method="post">
				    <s:token/>
					<s:textfield name="customer.name" label="Name" />
					<s:textfield name="customer.surname" label="Surname" />
					<s:textfield name="customer.username" label="Username" />
					<s:password name="customer.password" label="Password" />
					<s:textfield name="customer.email" label="Email" />
					<s:submit value="Insert" />
				</s:form>
			</div>



		</div>



	<br>

	<%@ include file="../Footer.jsp"%>
	</div>

</body>
</html>