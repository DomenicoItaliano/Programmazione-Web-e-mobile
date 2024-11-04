<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.admin.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admins Overview</title>
</head>
<body>
<div id="wrapper">

		<%@ include file="../Header.jsp"%>

  
		<div class="container">
			<h1 align="center">Admins overview</h1>

			<table border="1" style="border-collapse: collapse; width: 100%;"
				height="200">
				<tbody>
					<tr>
						<td style="width: 15%;" align="center">Admin code</td>
						<td style="width: 15%;" align="center">Name</td>
						<td style="width: 15%;" align="center">Surname</td>
						<td style="width: 15%;"align="center">Username</td>
						<td style="width: 15%;" align="center">Email</td>

					</tr>
					<s:iterator value="admins">

						<s:url var="EditAdminRequest" action="EditAdminRequest">
							<s:param name="idAdmin">
								<s:property value="idAdmin" />
							</s:param>
						</s:url>

						<tr>


							<td style="width: 15%;"  align="center"><s:property
									value="idAdmin" /></td>
							<td style="width: 15%;" align="center"><s:property
									value="name" /></td>
							<td style="width: 15%;"  align="center"><s:property
									value="surname" /></td>
							<td style="width: 15%;" align="center"><s:property
									value="username" /></td>
							<td style="width: 15%;" align="center"><s:property
									value="email" /></td>
						
						
						<td style="width: 9%;"  align="center"><s:a
									title="Update this item" class="remove"
									href="%{EditAdminRequest}">Edit </s:a></td>
									
									</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
	<br>	
</div>

		<%@ include file="../Footer.jsp"%>
</body>
</html>