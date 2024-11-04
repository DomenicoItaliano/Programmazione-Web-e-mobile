<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.item.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Mange items</title>
</head>
<body>
	<div id="wrapper">



		<%@ include file="../Header.jsp"%>




		<div class="container">
			<h4 align="left">Add uniform</h4>
			<div class="divform" align="left">
				<div style="background-color: #01bafd;">
					<s:actionerror />
				</div>
				<s:form action="InsertItemUniform" method="post"
					enctype="multipart/form-data">
					<s:token />
					<s:textfield name="nome" label="Name" />
					<s:file name="image" label="Img" />
					<s:textfield name="description" label="Description" />
					<s:textfield name="price" label="Price" />
					<s:textfield type="stockQuantity" name="stockQuantity" label="StockQuantity" />
					<s:textfield name="category" label="Category" />
					<s:textfield name="measure" label="Measure" />
					<s:submit value="Insert" />
				</s:form>
			</div>



		</div>
		<%@ include file ="../Footer.jsp" %>
</body>
</html>