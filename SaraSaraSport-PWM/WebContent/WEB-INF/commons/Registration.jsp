<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body onLoad="attivacampi('registration')">

	<div id="wrapper">
		<%@ include file="../Header.jsp"%>
		<!-- One -->
		<section id="One" class="wrapper style3">
			<div class="inner">
				<header class="align-center">
					<p>SaraSaraSport</p>
					<h2>Join us</h2>
				</header>
			</div>
		</section>

		<!-- Two -->
		<section id="two" class="wrapper style2">
			<div class="inner">
				<div class="box">
					<div class="content">
						<header class="align-center">
							<p>Enter here</p>
							<h2>your details</h2>
						</header>

						<s:form method="post" action="Registration" theme="simple">
						
							<div class="row uniform">
								<div class="6u$ 12u$(xsmall)">
									<s:textfield name="customer.name" key="Name" placeholder="Name" />
								</div>
								<div class="6u$ 12u$(xsmall)">
									<s:textfield name="customer.surname" key="Surname"
										placeholder="Surname" />
								</div>
								<div class="6u$ 12u$(xsmall)">
									<s:textfield name="customer.username" key="Username"
										placeholder="Username" />
								</div>
								<div class="6u$ 12u$(xsmall)">
									<s:textfield name="customer.email" key="Email"
										placeholder="Email" />
								</div>
								<div class="6u$ 12u$(xsmall)">
									<s:password name="customer.password" key="Password"
										onChange="passwordVerification()" placeholder="Password" />
								</div>
								<div class="6u$ 12u$(xsmall)">
									<s:password name="confirmation" key="Confirmation"
										onChange="passwordVerification()"
										placeholder="Confirm Password" />
								</div>
								<ul class="actions">
									<s:submit value="Sign in" />
									<s:reset value="Reset"></s:reset>
								</ul>
								</div>
						</s:form>
</div>
</div>
</div>
</section>
						<%-- 		<div class="container">

			<h4>
				<s:text name="Registration" />
			</h4>
			<div class="divform">
				<div style="background-color: #01bafd;">
					<s:actionerror />
				</div>
				<s:form action="Registration" method="post">
					<s:token />
					<s:textfield name="customer.name" key="Name" />
					<s:textfield name="customer.surname" key="Surname" />
					<s:textfield name="customer.email" key="Email" />
					<s:textfield name="customer.username" key="Username" />
					<div id="imgconf">
						<img alt="" id="fitt" />
					</div>
					<s:password name="customer.password" key="Password"
						onChange="passwordVerification()" />
					<s:password name="confirmation" key="Confirmation"
						onChange="passwordVerification()" />
					<s:submit value="Confirmation" />
				</s:form>
				<p>
					<s:text name="Registration mandatory" />
				</p>
			</div>



		</div>



	</div>
 --%>
						<%@ include file="../Footer.jsp"%>
</body>

</html>