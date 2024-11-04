<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Invoices overview</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>
<div class="myDiv">
		<!--start: Wrapper -->
		<div id="wrapper">

			<%@ include file="../Header.jsp"%>
	
						

<section id="One" class="wrapper style3">
				<div class="inner">
					<header class="align-center">
						<p>SaraSaraSport</p>
						<h2>Invoices</h2>
					</header>
				</div>
			</section>

  

    <section id="two" class="wrapper style2">
	<div class="inner">
		<div class="box">
			<div class="content">
   
  
    
    
 
    
    <div class="riqOrizzontale">
	
	<div class="tabellaFatture">
<table border="2" bordercolor="black" width=760px;>
<tbody>
<tr>
<td  align="center"><strong>Invoice N°</strong></td>
<td  align="center"><strong>Date</strong></td>
<td  align="center"><strong>Amount</strong></td>
<td align="center"><strong><img src="<%=request.getContextPath()%>/assets/img/Download.png" alt="sf" width=30 height=30></strong></td>

</tr>


<s:iterator value="customer.purchases"> 
<tr>
            <td align="center"> <s:property value="purchaseId.numero" /></td>
             <td align="center"> <s:property value="purchaseDate" /></td>
             <td align="center"> <s:property value="amount" /></td>
            <td align="center"><a href='DownloadInvoice?number=<s:property value="purchaseId.number"/>&year=<s:property value="purchaseId.year"/>'>Download</a></td>
          
            
</tr>
              	
              	
            </s:iterator>

</tbody>
</table>
    
   </div>
 </div>

</div>
</div></div>
</section>
    <%@ include file="../Footer.jsp"%>
</body>
</html>