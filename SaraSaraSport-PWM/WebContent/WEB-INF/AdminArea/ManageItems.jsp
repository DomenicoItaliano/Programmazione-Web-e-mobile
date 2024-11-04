<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.item.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Management Items</title>
</head>
<body>
	<div id="wrapper">



		<%@ include file="../Header.jsp"%>



		<div class="container">
			<h1 align="center">Items Management</h1>

			<table border="1" style="border-collapse: collapse; width: 100%;"
				height="200">
				<tbody>
					<tr>
						<td style="width: 9%;" align="center">Item code</td>
						<td style="width: 9%;" align="center">Name</td>
						<td style="width: 9%;" align="center">Price</td>
						<td style="width: 9%;" align="center">Stock quantity</td>
						<td style="width: 9%;" align="center">Category</td>
						<td style="width: 9%;" align="center">Description</td>
						<td style="width: 9%;" align="center">Photo</td>
						<td style="width: 9%;" align="center">Edit item</td>



					</tr>

					<s:iterator value="items">

						<s:url var="EditItemRequest"
							action="EditItemRequest">
							<s:param name="idItem">
								<s:property value="idItem" />
							</s:param>
						</s:url>






						<tr>

							<td style="width: 9%;" align="center"><s:property
									value="idItem" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="name" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="price" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="stockQuantity" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="category" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="description" /></td>
							<td style="width: 9%;" align="center"><s:property
									value="img" /></td>
							<td style="width: 9%;" align="center"><s:a
									title="Update this item" class=""
									href="%{EditItemRequest}">Edit
									Item</s:a></td>

						</tr>
					</s:iterator>
				</tbody>
			</table>
		</div>
		<div class="container">
			<li class="nav-item"><a
				href="<s:url action='InsertItemUniformRequest'/>">Insert
					uniform</a></li>
			<li class="nav-item"><a
				href="<s:url action='InsertItemBagRequest'/>">Insert
					bag</a></li>
			<li class="nav-item"><a
				href="<s:url action='InsertItemShoesRequest'/>">Insert
					shoes</a></li>

		</div>
	</div>
	<%@ include file="../Footer.jsp"%>

</body>




</html>