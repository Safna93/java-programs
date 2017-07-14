<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="UserHeader.jsp" %>
<html>
<head>
<title>UserHome</title>
	
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

</head>
<h2 align="center">User Home Page</h2>
<div class="col-sm-6 col-md-3">
<c:forEach items="${prodlist}" var="product"> 
<a href="ProductDesc/${product.prodid }" class="thumbnail">
<img src="<c:url value="/resources/images/${product.prodid }.jpg"/>" alt="Error on loading images"/>
</a>
<div class="caption">
<h4>${product.prodname}</h4>
<p>Rs.${product.price}</p>
</div>
</c:forEach>
</div>

<%@include file="Footer.jsp" %>
</body>
</html>