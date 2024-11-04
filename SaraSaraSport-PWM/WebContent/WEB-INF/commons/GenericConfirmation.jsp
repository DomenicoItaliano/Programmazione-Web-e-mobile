<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Operation performed</title>
<%@ include file ="../Header.jsp" %>
</head>
<body>
<section id="two" class="wrapper style2">
	<div class="inner">
		<div class="box">
			<div class="content">
				<header class="align-center">
				<img src="<%= request.getContextPath() %>/assets/img/ConfermaPaypal.png" class="errAutenticazione">
			<h4 class="testoConfermaAutenticazione">The operation was successful. Happy Browsing</h4>
			
			</header>
			<br>
			</div>
			</div>
			</div>
			</section>
<%-- <div>
<img src="<%= request.getContextPath() %>/assets/img/ConfermaPaypal.png" class="errAutenticazione">
			<h4 class="testoConfermaAutenticazione">The operation was successful. Happy Browsing</h4>
				 <s:actionmessage/>
	  </div>
	   --%>
	 
	  <%@ include file ="../Footer.jsp" %>
</body>
</html>