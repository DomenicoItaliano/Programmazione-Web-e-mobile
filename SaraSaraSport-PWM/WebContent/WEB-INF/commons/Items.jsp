<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.item.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Shop</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->



<%@ include file="../Header.jsp"%>
</head>
<style>
.myDiv {
	text-align: center;
}
</style>

<!-- One -->
<section id="One" class="wrapper style3">
	<div class="inner">
		<header class="align-center">
			<p>SaraSaraSport</p>
			<h2>Shop</h2>
		</header>
	</div>
</section>

<!-- Two -->
<section id="two" class="wrapper style2">
	<div class="inner">
		<div class="box">
			<div class="content">
				<header class="align-center">

					<h2>Search by:</h2>
				</header>

				<br> <br>

				<%-- <div class="container">
			<div class="row justify-content-center mb-3 pb-3">
				<div class="col-md-12 heading-section text-center ftco-animate">
					<span class="subheading">Featured Products</span>
					<h2 class="mb-4">Our catalogue</h2>
					<p>.</p>
				</div>
			</div>
		</div> --%>
				<section class="ftco-section">
					<!-- start sidebar -->
					<aside class="mu-sidebar">

						<div class="mu-single-sidebar">
							<div class="divform">
								<div
									style="background-color: #00000; color: black; font-weight: bold">
									<s:actionerror />
								</div>
							</div>

							<s:form action="Items" method="post" theme="simple">

								<div class="row uniform">
									<div class="12u$">
										<div class="select-wrapper">
											<s:select name="category"
												list="#{'1':'Uniform', '2':'Bag', '3':'Shoes'}" />
										</div>
									</div>
									<div class="12u$">
										<div class="select-wrapper">
											<s:select name="type" list="#{'1':'Description', '2':'Name'}" />
										</div>
									</div>
									<div class="6u$ 12u$(xsmall)">
										<s:textfield name="text" />
									</div>
									<br> <br>
									<ul class="actions">
										<li><s:submit type="submit" value="Enter" /></li>
										<li><s:reset type="reset" value="Reset" class="alt" /></li>
									</ul>
								</div>
							</s:form>
						</div>
					</aside>
					<!-- end single sidebar -->
				</section>
			</div>
		</div>
	</div>
</section>
<section class="ftco-section">
	<div class="myDiv">
		<table>
			<s:iterator value="items" status="status">
				<s:if test="%{#status.index%1 == 0}">
					<tr>

					</tr>
					<div class="col-md-6 col-lg-3 ftco-animate">
						<div class="product">
							<a href="#" onclick='aprifinestra(<s:property value="idItem"/>)'>
								<s:text name="items.overview" /><img class="img-fluid"
								src="<%=request.getContextPath()%>/assets/img/Prodotti/prodotto<s:property value="idItem"/>.jpg"
								alt="Colorlib Template">
							</a>
							<div class="text py-3 pb-4 px-3 text-center">
								<h3>
									<a><s:property value="name" /></a>
								</h3>
								<div class="d-flex">
									<div class="pricing">
										<p class="price">
											<s:text name="items.price" />
											<s:property value="price" />
											$
										</p>
									</div>
								</div>

							</div>
						</div>
					</div>


				</s:if>

			</s:iterator>

		</table>

		<!--	<table>
	<s:iterator value="prodotti" status="status">
	<s:if test="%{#status.index%3 == 0}">
		<div class="container">
			<div class="row">
				<div class="col-md-6 col-lg-3 ftco-animate">
					<div class="product">
						<a href="#" onclick='aprifinestra(<s:property value="idProdotto"/>)'> <s:text name="prodotti.scheda" /><img class="img-fluid"
							src="<%=request.getContextPath()%>/assets/img/Items/prodotto<s:property value="idProdotto"/>.jpg"
							alt="Colorlib Template"> </a>
						<div class="text py-3 pb-4 px-3 text-center">
							<h3>
								<a><s:property value="titolo" /></a>
							</h3>
							<div class="d-flex">
								<div class="pricing">
									<p class="price">
										 <s:text name="prodotti.prezzo"/>
                                        <s:property value="prezzo" /> $
									</p>
								</div>
							</div>
							
						</div>
					</div>
				</div>

			</div>

		</div>
		</s:if>
	</s:iterator>
	</table>
	-->
	</div>
	
</section>


<%@ include file="../Footer.jsp"%>












<!-- Custom js -->
<script src="js/aprifinestra.js"></script>
</body>
</html>