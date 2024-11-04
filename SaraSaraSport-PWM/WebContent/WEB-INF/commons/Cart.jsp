<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!DOCTYPE html>
<html lang="en">
<head>

<!-- start: Meta -->
<meta charset="utf-8">
<title>Cart</title>


</head>
<body>
	<style>
.myDiv {
	text-align: center;
}
</style>
	<div class="myDiv">
		<!--start: Wrapper -->
		<div id="wrapper">

			<%@ include file="../Header.jsp"%>
			<!-- One -->
			<section id="One" class="wrapper style3">
				<div class="inner">
					<header class="align-center">
						<p>SaraSaraSport</p>
						<h2>Cart</h2>
					</header>
				</div>
			</section>

			<!-- Two -->
			<section id="two" class="wrapper style2">
				<div class="inner">
					<div class="box">
						<div class="content">
							<header class="align-center">
								<p>Cart</p>
							</header>

							<!-- start: Container -->
							<div class="container ">












								<s:iterator value="item">



									<div class="containerCart">
										<img id="ItemPreview" class="imageCart"
											src="<%=request.getContextPath()%>/assets/img/Prodotti/prodotto<s:property value="idItem"/>.jpg">


										<h4 id="font2cartTitolo">
											<s:property value="name" />
										</h4>
										<h4 id="font2carrelloPrezzo">
											<s:property value="price" />
											€
										</h4>
										<h4 id="font2carrelloQuantita">
											<s:property value="quantity" />
										</h4>
										<%-- Qui ha il significato di quantità --%>
										<h4 id="font2carrelloTotale">
											<s:property
												value="%{@java.lang.Math@round(((quantity*price)*100.0))/100.0}" />
											€
										</h4>


										<div id="deleteCart">
											<a href="DeleteFromCart?idItem=<s:property value="idItem" />">
												<img src="assets/img/Xrossa.png">
											</a>
										</div>

									</div>


									<hr id="lineacarr2" color="green" size=4 width=940 align="left"
										noshade>
								</s:iterator>


							</div>


							<div id="posCarrello2">

								<ul id="posizionelistacarrello">
									<li id="listacarrello5"><h3 id="fontcarrello">
											Total:&nbsp&nbsp
											<s:property value="total" />
											€
										</h3></li>






								</ul>


							</div>
							<div id="buttonPaga">

								<s:form name="form" method="post" action="OnlinePurchase"
									theme="simple">
									<s:actionerror />
									<s:token></s:token>
									<fieldset>
										<s:hidden name="total" value="%{total}" />

										<s:iterator value="item" status="iterator">

											<s:hidden name="item[%{#iterator.index}].idItem" />
											<s:hidden name="item[%{#iterator.index}].price" />
											<s:hidden name="item[%{#iterator.index}].name" />
											<s:hidden name="item[%{#iterator.index}].description" />
											<s:hidden name="item[%{#iterator.index}].category" />
											<s:hidden name="item[%{#iterator.index}].img" />



											<s:hidden name="item[%{#iterator.index}].stockQuantity" />
											<!-- ha il significato di quantita -->



										</s:iterator>


										<div class="actions bottone-scheda">
											<s:submit value="Pay Now"
												onclick="return confirm('Are you sure?');"></s:submit>
										</div>


									</fieldset>

								</s:form>

							</div>
						</div>
					</div>
				</div>
			</section>
		</div>
	</div>

	<%@ include file="../Footer.jsp"%>



	<!-- start: Java Script -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="js/jquery-1.8.2.js"></script>
	<script src="js/bootstrap.js"></script>
	<script src="js/flexslider.js"></script>
	<script src="js/carousel.js"></script>
	<script src="js/custom.js"></script>
	<script src="js/mieiscript.js"></script>






	<!-- end: Java Script -->

</body>
</html>