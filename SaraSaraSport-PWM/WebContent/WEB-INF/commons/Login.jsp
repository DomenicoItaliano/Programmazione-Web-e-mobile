<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reserved Area</title>




</head>
<body>

	<%@ include file="../Header.jsp"%>

	<!-- One -->
	<section id="One" class="wrapper style3">
	<div class="inner">
		<header class="align-center">
		<p>SaraSaraSport</p>
		<h2>Reserved Area</h2>
		</header>
	</div>
	</section>

	<!-- Two -->
	<section id="two" class="wrapper style2">
	<div class="inner">
		<div class="box">
			<div class="content">
				<header class="align-center">

				<h2>Enter your credentials here</h2>
				</header>
				<br> <br>



				<s:form method="post" action="Login" theme="simple">
					<s:token />
					<div class="row uniform">
						<div class="6u$ 12u$(xsmall)">
							<s:textfield name="username" key="username"
								placeholder="Username" />
						</div>
						<div class="6u 12u$(xsmall)">
							<s:password name="password" key="password" placeholder="Password" />
						</div>
					</div>
					<br>
					<!-- Break -->

					<div class="12u$">
						<div class="select-wrapper">
							<s:select name="type" list="#{'1':'Admin', '2':'Customer'}" />
						</div>
					</div>
					<br>
					<ul class="actions">
						<li><s:submit type="submit" value="Enter" /></li>
						<li><s:reset type="reset" value="Reset" class="alt" /></li>
					</ul>
				</s:form>
				<div style="" " align="center"">
					<h4>
						Non hai ancora un account ? <a href="RegistrationRequest">Sign
							In</a>
					</h4>
				</div>

				<%-- 			
  <s:form action="RegistrationRequest" method="post">
<h3>Se non sei ancora registrato , Registrati </h3>
<s:submit value="QUI"/>
  
  </s:form> --%>
			</div>
		</div>

	</div>



	</section>
	<%@ include file="../Footer.jsp"%>

</body>

</body>
</html>