<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<%@page import="it.unirc.pojo.customer.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Visualizza Customers</title>
</head>
<body>
    <div id="wrapper">

 

        <%@ include file="../Header.jsp"%>

 


        <div class="container">
            <h1 align="center">Riepilogo Customers</h1>

 

            <table border="1" style="border-collapse: collapse; width: 100%;"
                height="200">
                <tbody>
                    <tr>
                        <td style="width: 15%;"  align="center">Customer code</td>
                        <td style="width: 15%;" align="center">Name</td>
                        <td style="width: 15%;"  align="center">Surname</td>
                        <td style="width: 15%;"  align="center">Username</td>
                        <td style="width: 15%;"  align="center">Email</td>
                        
                        <td style="width: 15%;" align="center">Edit Customer</td>
                        <td style="width: 15%;"  align="center">Delete Customer</td>
                        

 

                    </tr>
                    <s:iterator value="clienti">
                    
                    <s:url var="EditCustomerRequest"
                            action="EditCustomerRequest">
                            <s:param name="idCustomer">
                                <s:property value="idCustomer" />
                            </s:param>
                        </s:url>

 

                        <s:url var="DeleteCustomer" action="DeleteCustomer">
                            <s:param name="idCustomer">
                                <s:property value="idCustomer" />
                            </s:param>
                        </s:url>
                        
                        

 

                        <tr>

 


                            <td style="width: 15%;" align="center"><s:property
                                    value="idCustomer" /></td>
                            <td style="width: 15%;" align="center"><s:property
                                    value="name" /></td>
                            <td style="width: 15%;"  align="center"><s:property
                                    value="surname" /></td>
                            <td style="width: 15%;"  align="center"><s:property
                                    value="username" /></td>
                            <td style="width: 15%;"  align="center"><s:property
                                    value="email" /></td>
                              
                            <td style="width: 9%;"  align="center"><s:a
                                    title="Update this item" class=""
                                    href="%{EditCustomerRequest}">Edit
                                    Customer</s:a></td>
                            <td style="width: 15%;" align="center"><s:a
                                    title="Remove this item" class="remove"
                                    href="%{DeleteCustomer}"
                                    onclick="return confirm('Are you sure?');">Delete
                                    Customer</s:a></td>
                                    
                                    
                        </tr>
                    </s:iterator>
                </tbody>
            </table>
        </div>
        <br>
</div>
        <%@ include file="../Footer.jsp"%>
        
</body>

 


</html>