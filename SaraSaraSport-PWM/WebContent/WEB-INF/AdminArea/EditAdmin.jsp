<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@page import="it.unirc.pojo.admin.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit admin</title>
</head>
<body>
	<div id="wrapper">

		<%@ include file="../Header.jsp"%>


		<div class="container">

			<h4 align="left">Edit admin</h4>
			<div class="divform" align="left">
				<div style="background-color: #01bafd;"></div>
				<s:form action="EditAdmin" method="post">
				    <s:token/>
					<s:textfield name="admin.idAdmin"
						value="%{#session.user.idAdmin}" label="Id admin"
						readonly="true" />
					<s:textfield name="admin.name"
						value="%{#session.user.name}" label="Name" readonly="true" />

					<s:textfield name="admin.surname"
						value="%{#session.user.surname}" label="Surname" readonly="true" />
					<s:textfield name="admin.username"
						value="%{#session.user.username}" label="username" />
					<s:password name="old_password"
						placeholder="Enter old password" label="old_password" />
					<s:password name="admin.password"
						placeholder="Enter new password" label="new_password" />
					<s:textfield name="admin.email" value="%{#session.user.email}" label="email" />
					<s:submit value="Edit" />
				</s:form>
			</div>
		</div>


		<%@ include file="../Footer.jsp"%>

</body>
</html>