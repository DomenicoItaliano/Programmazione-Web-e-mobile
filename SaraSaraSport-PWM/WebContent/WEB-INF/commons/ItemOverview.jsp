<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html lang="en">
<head>

	<!-- start: Meta -->
	<meta charset="utf-8">
	<title>Item overview</title> 



</head>
<body >
<%@include file="../Header.jsp"%>
<%if(request.getAttribute("ChiudiScheda")!=null){
	 %>
<script>
window.open('', '_self', ''); 
window.close();
</script>
<%} %>











<div id="wrapper">
<div class="tit-scheda"><h4><s:property value="item.name"/></h4></div>
<div ><img class="imm-scheda" src="<%=request.getContextPath()%>/assets/img/Prodotti/prodotto<s:property value="item.idItem"/>.jpg"></div>
<div class="descr-scheda"><p class="testodesc">
<s:property value="item.description"/>
</p></div>

<div class="prezzo-scheda"><h4>Price:<s:property value="item.price"/>&#x20AC;</h4> </div>
<s:form name="form" method="post" action="AddToCart" theme="simple">
	<s:hidden name="idItem" value="%{item.idItem}" /><s:hidden name="item.title" value="%{#item.name}" /><s:hidden name="item.description" value="%{item.description}" />
	<s:hidden name="item.price" value="%{item.price}" /> <s:hidden name="item.stockQuantity" value="%{item.stockQuantity}" />					
<fieldset>
						
						
							<div class="clearfix">
								<label for="name"class="input quant-scheda"><span>stockQuantity (Max: <s:property value="item.stockQuantity"/>):</span></label>
								<div class="input quant-scheda1">
									<label><s:textfield name="quantity" style="width:50px" /></label>
								</div>
							</div>
						
							<div class="clearfix " >
						
                             <br>
                           
                    <s:token></s:token>
							 <% Object a=session.getAttribute("user");
                     if(a==null || a.getClass().getName().equals("it.unirc.pojo.customer.Customer")){ %>
							<div class="actions bottone-scheda">
						<s:submit value="Add to cart"></s:submit>
							</div>
							<%} %>
							
							
							
							</div>
							
						<s:fielderror/>	
						

						</fieldset>
					
					</s:form>
		</div>	
		<%@include file="../Footer.jsp"%>	
</body>
</html>
