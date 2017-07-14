<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@include file="Header.jsp" %>
<table cellspacing="3" align="center" >
<tr>
<td colspan="5"><center><h3>Shopping Cart</h3></center></td>
</tr>
<tr bgcolor="gray">
<td>Product Name</td>
<td>Quantity</td>
<td>SubTotal</td>
<td>Image</td>
</tr>

<c:forEach items="${cartitems }" var="cartitem">
<tr>
<td>${cartitem.prodname }</td>
<td>${cartitem.quantity }</td>
<td><input type="text" value="${cartitem.quantity }" name="quantity" required/></td>
<td>${cartitem.price * cartitem.quantity }</td>
<td><img src="<c:url value='/resources/images/${cartitem.prodid }.jsp'/>" width="100" height="100">
</tr>
<tr>
<td colspan="3">Grant Total</td>
<td>${grandtotal }</td>
</tr>
</table>
</c:forEach>


<table cellspacing="3" cellpadding="2" align="center">
<tr bgcolor="gray">
<td colspan="2">Payment Information</td>
</tr>

<tr>
<td>Payment Mode</td>
<td>
<input type="radio" name="pmode" value="CC" />Credit Card
<input type="radio" name="pmode" value="IB" />Internet Banking
<input type="radio" name="pmode" value="CD" />Cash On Delivery
</td>
</tr>
<tr bgcolor="gray">
<td colspan="2"><input type="submit" value="pay" /></td>
</tr>


</table>
</body>
</html>