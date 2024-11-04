<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@page import="it.unirc.pojo.admin.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Admin</title>
</head>

<body onLoad="attivacampi('customerarea')">
	<div id="wrapper">

		<%@ include file="../Header.jsp"%>

		<div class="container">
			<h4 align="left">Insert Admin</h4>
			<div class="divform" align="left">
				<div style="background-color: #01bafd;">
					<s:actionerror />
				</div>
				<s:form action="InsertAdmin" method="post">
				    <s:token/>
					<s:textfield name="admin.name" label="Name" />
					<s:textfield name="admin.surname" label="Surname" />
					<s:textfield name="admin.username" label="Username" />
					<s:password name="admin.password" label="Password" />
					<s:textfield name="admin.email" label="Email" />
					<s:submit value="Insert" />
				</s:form>
			</div>



		</div>

<br>

	

	<%@ include file="../Footer.jsp"%>
</body>
</html>