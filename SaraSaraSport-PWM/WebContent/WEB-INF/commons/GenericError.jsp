<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>An error has occurred</title>
<%@ include file="../Header.jsp"%>
</head>
<body>
<section id="two" class="wrapper style2">
	<div class="inner">
		<div class="box">
			<div class="content">
				<header class="align-center">
<img src="<%= request.getContextPath() %>/assets/img/ErrorePayPal.png" class="errAutenticazione">
				<h2 class="testoErroreAutenticazione">An error has occurred. Navigate correctly or try again later</h2>
			
				</header>
				<br>
				<div style="" " align="center"">
					<h3>
						 <a href="RegistrationRequest">Come back</a>
					</h3>
				</div>
			</div>
			</div>
			</div>
			</section>	

<<%-- div>
<img src="<%= request.getContextPath() %>/assets/img/ErrorePayPal.png" class="errAutenticazione">
			<h4 class="testoErroreAutenticazione">An error has occurred.Navigate correctly or try again later</h4>
	
	<s:actionerror/>
	  </div> --%>
	  <%@ include file ="../Footer.jsp" %>
</body>
</html>