<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.item.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Edit Item</title>
</head>
<body>
    <div id="wrapper">

 

        <%@ include file="../Header.jsp"%>
		<div class="container">

			<h4 align="left">Edit Item</h4>
			<div class="divform" align="left">
				<div style="background-color: #01bafd;"></div>
				<s:form action="EditItem" method="post">
				    <s:token/>
					<s:textfield name="item.idItem" 
						value="%{item.idItem}" readonly="true" label="Id item" />
					<s:textfield name="item.name" 
						value="%{item.title}" label="Name"/>
					<s:textfield name="item.img" 
						value="%{item.img}" label="Img"/>
					<s:textfield name="item.description" 
						value="%{item.description}" label="Description"/>
					<s:textfield name="item.price" value="%{item.price}"
						label="Price" />
					<s:textfield name="item.stockQuantity" value="%{item.stockQuantity}"
						label="Availability" />
					<s:textfield name="item.category" 
						value="%{item.category}" label="Category" />
					
					

					<s:submit value="Edit" />
				</s:form>
			</div>
		</div>


	</div>
<%@ include file="../Footer.jsp"%>
        
</body>

 


</html>