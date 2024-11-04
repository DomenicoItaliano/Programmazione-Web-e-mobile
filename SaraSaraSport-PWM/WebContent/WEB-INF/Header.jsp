<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="it.unirc.pojo.customer.Customer"%>
<%@ page import="org.apache.struts2.ServletActionContext"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="it.unirc.pojo.cardBalance.CardBalance"%>

<html lang="en">
<head>
<title>SaraSaraSport</title>

<%
	Object aut = session.getAttribute("user");
%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrollex.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<script src="assets/js/main.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1" />
<link rel="stylesheet" href="assets/css/main.css" />

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<link
	href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
<link rel="stylesheet" href="css/animate.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<link rel="stylesheet" href="css/owl.theme.default.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">
<link rel="stylesheet" href="css/aos.css">
<link rel="stylesheet" href="css/ionicons.min.css">
<link rel="stylesheet" href="css/bootstrap-datepicker.css">
<link rel="stylesheet" href="css/jquery.timepicker.css">
<link rel="stylesheet" href="css/flaticon.css">
<link rel="stylesheet" href="css/icomoon.css">
<link rel="stylesheet" href="css/style.css">

</head>
<body>
<body class="subpage">

	<!-- Header -->
	<header id="header">
	<div class="logo">
		<a href="Home">
			<h2>SaraSaraSport</h2>
		</a>
	</div>
	
	<a href="#menu">Menu</a> </header>

	<!-- Nav -->
	<nav id="menu">
	<ul class="links">


		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/AboutUs" class="nav-link">About</a></li>
		<%
			if (aut != null) {
			if (aut.getClass().getName().equals("it.unirc.pojo.customer.Customer")) {
		%>

		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
		</div>
		</li>
		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/Items" class="nav-link">Shop</a></li>
		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/Logout" class="nav-link">Logout</a></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="<%=request.getContextPath()%>/CustomerReservedArea"
			id="dropdown04" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">Reserved area</a>
			<div class="dropdown-menu" aria-labelledby="dropdown04">
				<a class="dropdown-item" href="<s:url action='EditRequest'/>">Edit request
					</a> <a class="dropdown-item" href="<s:url action='ViewInvoices'/>">View invoices
					</a> <a class="dropdown-item"
					href="<s:url action='AddFundsCardBalance'/>">Add funds card balance</a>
				<li class="nav-item cta cta-colored"><a
					href="<%=request.getContextPath()%>/Cart" class="nav-link"><span
						class="icon-shopping_cart"></span></a></li>

				<div class="balance">
					Balance:
					<%
					if (((Customer) aut).getCardBalance() == null) {
				%>
					Saldo non disponibile<%
					} else {
				%>
					<%=(double) (Math.round((((Customer) aut).getCardBalance().getBalance()) * 100)) / 100%>
					&#x20AC;
				</div>
			</div>
			</div> </section> <%
 	}
 }
 %> <%
 	if (aut.getClass().getName().equals("it.unirc.pojo.admin.Admin")) {
 %><div class="collapse navbar-collapse" id="ftco-nav">
				<ul class="navbar-nav ml-auto">
			</div></li>
		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/Logout" class="nav-link">Logout</a></li>
		<li class="nav-item dropdown"><a class="nav-link dropdown-toggle"
			href="<%=request.getContextPath()%>/AdminReservedArea"
			id="dropdown04" data-toggle="dropdown" aria-haspopup="true"
			aria-expanded="false">Reserved Area</a>
			<div class="dropdown-menu" aria-labelledby="dropdown04">
				<a class="dropdown-item" href="<s:url action='AdminsOverview'/>">View admin
					</a> <a class="dropdown-item"
					href="<s:url action='InsertAdminRequest'/>">Insert Admin</a> <a
					class="dropdown-item" href="<s:url action='CustomersOverview'/>">View customer
					</a> <a class="dropdown-item"
					href="<s:url action='InsertCustomerRequest'/>">Insert customer
					</a> <a class="dropdown-item"
					href="<s:url action='ManageItems'/>">Manage items</a>

			</div></li>

		<%
			}
		%>
		<%
			} else {
		%>
		<div class="collapse navbar-collapse" id="ftco-nav">
			<ul class="navbar-nav ml-auto">
		</div>
		</li>
		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/Items" class="nav-link">Shop</a></li>
		<li class="nav-item"><a
			href="<%=request.getContextPath()%>/LoginRequest" class="nav-link">Login</a></li>
		<li class="nav-item cta cta-colored"><a
			href="<%=request.getContextPath()%>/Cart" class="nav-link"><span
				class="icon-shopping_cart"></span></a></li>

		<%
			}
		%>


	</ul>
	</nav>


</body>
</html>