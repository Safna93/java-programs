<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>

<div id="container">

<c:forEach items="${prodlist}" var="product">
<div class="row">
<div class="col-sm-6 col-md-3">
<a href="ProductDesc/${product.prodid}" class="thumbnail">
<img src="<c:url value="/resources/images/${product.prodid}.jpg"/>" alt="Generic placeholder thumbnail"/>
</a>

<div class="caption">

<h4><b><i>PRODUCT NAME:${product.prodname}</i></b></h4>

<p><i><b>Rs.${product.price}</b></i></p>
<p><h4><b>${product.pimage}</b></h4></p>

</div>
</div>
</div>
</c:forEach>
</div>

<%@include file="Footer.jsp" %>