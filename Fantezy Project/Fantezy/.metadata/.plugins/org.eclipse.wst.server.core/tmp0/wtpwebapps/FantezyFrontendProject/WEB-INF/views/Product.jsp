<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="AdminHeader.jsp"%>

<form:form method="POST" action="InsertProduct" modelAttribute="product" enctype="Multipart/form-data">
<table align="center">
			<tr>
				<td colspan="2"><center><h3><b>Product Details</b></h3></center></td>
			</tr>
			<tr>
				<td><h4><b>Product ID</b></h4></td>
				<td><form:input path="prodid" /></td>
			</tr>
			<tr>
				<td><h4><b>Product Name</b></h4></td>
				<td><form:input path="prodname" /></td>
			</tr>
			
			<tr>
				<td><h4><b>Category</b></h4></td>
				<td><form:select path="catid">
						<form:option value="0" label="------Select----" />
						<form:options items="${catlist}" />
					</form:select>
				</td>
			</tr>		
			<tr>
				<tr>
				<td><h4><b>Supplier</b></h4></td>
				<td><form:input path="suppid" /></td>
			</tr>
			</tr>		
			
			<tr>
				<td><h4><b>Price</b></h4></td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><h4><b>Stock</b></h4></td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td><h4><b>Product Desc</b></h4></td>
				<td><form:textarea path="proddesc" /></td>
			</tr>
			<tr>
				<td><h4><b>Product Image</b></h4></td>
				<td><form:input type="file" path="pimage" /></td>
			</tr>
			
			<tr>
			<td colspan="2"><input type="submit" class="btn btn-default"/></td>
			
			</tr>
</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="5">

	<tr bgcolor="#ff66ff">
		<td>Product ID</td>
		<td>Product Name</td>
		<td>Price</td>
		<td>Quantity</td>
		<td>Category Id</td>
		<td>Supplier Id</td>
		<td>Operations</td>
	</tr>
	<c:forEach items="${prodlist}" var="product">
		<tr bgcolor="#00ff99">
			<td>${product.prodid}</td>
			<td>${product.prodname}</td>
			<td>${product.price}</td>
			<td>${product.quantity}</td>
			<td>${product.catid}</td>
			<td>${product.suppid}</td>
			<td><a href="<c:url value="deleteProduct/${product.prodid}"/>">Delete</a>
				<a href="<c:url value="updateProduct/${product.prodid}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->
<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
<%@include file="Footer.jsp" %>
</body>
</html>