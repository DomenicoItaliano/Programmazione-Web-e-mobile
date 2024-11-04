<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.customer.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Edit Customer</title>

<!-- Favicon -->


<!-- Font awesome -->
<link href="../assets/css/font-awesome.css" rel="stylesheet">
<!-- Bootstrap -->
<link href="../assets/css/bootstrap.css" rel="stylesheet">
<!-- Slick slider -->
<link rel="stylesheet" type="text/css" href="../assets/css/slick.css">
<!-- Fancybox slider -->
<link rel="stylesheet" href="../assets/css/jquery.fancybox.css"
  type="text/css" media="screen" />
<!-- Theme color -->
<link id="switcher" href="../assets/css/theme-color/default-theme.css"
  rel="stylesheet">

<!-- Main style sheet -->
<link href="../assets/css/style.css" rel="stylesheet">


<!-- Google Fonts -->
<link href='https://fonts.googleapis.com/css?family=Montserrat:400,700'
  rel='stylesheet' type='text/css'>
<link
  href='https://fonts.googleapis.com/css?family=Roboto:400,400italic,300,300italic,500,700'
  rel='stylesheet' type='text/css'>


<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>
<body>
  <div id="wrapper">

    <%@ include file="../Header.jsp"%>


    <div class="container">

   <h4>Edit customer</h4>
   <div class="divform">
    <div style="background-color: #01bafd;"></div>
    <s:form action="EditCustomer" method="post">
    <s:token/>
     <s:textfield name="customer.idCustomer"
      value="%{#session.user.idCustomer}" label="Customer code"
      readonly="true" />

     <s:textfield name="customer.name" value="%{#session.user.name}"
      label="Name" readonly="true" />
     <s:textfield name="customer.surname"
      value="%{#session.user.surname}" label="Surname" readonly="true" />
     <s:textfield name="customer.username"
      value="%{#session.user.username}" label="Username" />
     <s:password name="old_password" label="Old Password"
      placeholder="Enter your previous password" />
     <s:password name="customer.password" label="New Password"
      placeholder="Enter your new password" />
     <s:textfield name="customer.email" value="%{#session.user.email}"
      label="Email" readonly="true" />
     <s:submit value="Edit" />
    </s:form>
   </div>
  </div>
</div>

    <%@ include file="../Footer.jsp"%>

</body>

<!-- jQuery library -->
    <script src="../assets/js/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="../assets/js/bootstrap.js"></script>
    <!-- Slick slider -->
    <script type="text/javascript" src="../assets/js/slick.js"></script>
    <!-- Counter -->
    <script type="text/javascript" src="../assets/js/waypoints.js"></script>
    <script type="text/javascript" src="../assets/js/jquery.counterup.js"></script>
    <!-- Mixit slider -->
    <script type="text/javascript" src="../assets/js/jquery.mixitup.js"></script>
    <!-- Add fancyBox -->
    <script type="text/javascript"
      src="../assets/js/jquery.fancybox.pack.js"></script>


    <!-- Custom js -->
    <script src="../assets/js/custom.js"></script>
</html>