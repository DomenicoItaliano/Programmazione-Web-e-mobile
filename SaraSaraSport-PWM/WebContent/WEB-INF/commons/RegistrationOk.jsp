<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful registration</title>
</head>
<body onLoad="attivacampi('registration')">

<div id="wrapper">
<%@ include file ="../Header.jsp" %>

<div class="container">

<hr>
	    <h3>Registration Done</h3>      
        <p>Dear <s:property value="customer.name"/>, 
        you have been registered in the system.
        <br />
       Thanks
        </p>
      <hr>



</div>
 
 
 
 </div>
<%@ include file="../Footer.jsp"%>

</body>

</html>