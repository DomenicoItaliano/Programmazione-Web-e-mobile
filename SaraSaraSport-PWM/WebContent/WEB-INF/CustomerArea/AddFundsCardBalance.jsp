<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ page import="it.unirc.pojo.customer.Customer"%>

<%@ page import="org.apache.struts2.ServletActionContext"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Funds to Card Balance</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<%@ include file="../Header.jsp"%>
</head>
<body >
<%if(request.getAttribute("ChiudiScheda")!=null){
	 %>
<script>
window.open('', '_self', ''); 
window.close();
</script>
<% } %>





<div id="wrapper">
<div class="tit-scheda"><h4><s:property value="item.name"/></h4></div>
<div ><img class="imm-scheda" src="<%=request.getContextPath()%>/assets/img/money2.jpg"></div>








<s:form name="form" method="post" action="Reload" theme="simple">
<s:token/>
	<s:hidden name="idCustomer" value="%{customer.idCustomer}" /><s:hidden name="customer.name" value="%{#customer.name}" /> <s:hidden name="customer.surname" value="%{customer.surname}" /> <s:hidden name="customer.username" value="%{customer.username}" />
	<s:hidden name="customer.password" value="%{customer.password}" /> <s:hidden name="customer.email" value="%{customer.email}" />				
<fieldset>
						
						
							<div class="clearfix">
								<label for="name"class="input quant-scheda"><span><%
		if (((Customer) aut).getCardBalance() == null) {
	%>
		Balance not available<%
		} else {
	%>
		your balance is<%=(double) (Math.round((((Customer) aut).getCardBalance().getBalance()) * 100)) / 100%>
		&#x20AC;
		<% }%>
		
		
		 </span></label>
		 </div>
		 
		 <div class="input quant-scheda1">
									<label><s:textfield name="money" style="width:200px" /></label> Enter the amount to top up (max 1000 &#x20AC;)
								</div>
								
						
							<div class="clearfix">
						
                             <br>
                           
                     <%if(aut==null || aut.getClass().getName().equals("it.unirc.pojo.customer.Customer")){ %>
							<div style="width:300px">
						<s:submit value="Reload"></s:submit>
							</div>
							<%} %>
							
							
							</div>
							
							
						<s:fielderror/>	
						
                        
						</fieldset>
					
					</s:form>
					</div>
		<%@ include file="../Footer.jsp"%>	
</body>
</html>