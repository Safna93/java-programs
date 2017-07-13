<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>
<br><br><br><br><br><br><br><br><br>

<table width="60%" align="center" border="5">
<td rowspan="7"><img src="<c:url value="/resources/images/${prodinfo.prodid}.jpg"/>"/></td>
<tr bgcolor="black">
<td colspan="3"><center><b><h4>Product Description</h4></b></center></td>
</tr>

<tr>
<td>Product ID</td><td>${prodinfo.prodid}</td>
</tr>
<tr>
<td>Product Name</td><td>PRODUCT NAME:${prodinfo.prodname}</td>
</tr>
<tr>
<td>Supplier</td><td>${prodinfo.suppid}</td>
</tr>
<tr>
<td>Product Desc</td><td>${prodinfo.proddesc}</td>
</tr>
<tr>
<td>Price</td><td>RS.${prodinfo.price}</td>
</tr>
<tr>
<td>
<form action="<c:url value="/addToCart/${prodinfo.prodid}"/>" method="get"></td>
Quantity <input type="text" name="quantity" class="form-control btn-block"/>
<input type="submit" value="AddToCart" class="btn btn-xs btn-success btn-block"/>

</form>
</tr>


</table>
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>
