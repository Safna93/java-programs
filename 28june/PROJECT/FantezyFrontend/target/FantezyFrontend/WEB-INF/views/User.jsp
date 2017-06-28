<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>


<form:form action="InsertUser" modelAttribute="user">
	<table align="center">
		<tr>
			<td colspan="2"><center>User Details</center></td>
		</tr>

		<tr>
			<td>UserName</td>
			<td><form:input path="userName" /></td>
		</tr>

        <tr>
		<td>Password</td>
		<td><form:textarea path="password" /></td>
		</tr>
		
		 <tr>
		<td>Cutomer Name</td>
		<td><form:textarea path="customerName" /></td>
		</tr>
		 <tr>
		<td>Role</td>
		<td><form:textarea path="role" /></td>
		</tr>
		 <tr>
		<td>Enabled</td>
		<td><form:textarea path="enabled" /></td>
		</tr>
		 <tr>
		<td>Email</td>
		<td><form:textarea path="email" /></td>
		</tr>
		 <tr>
		<td>Address</td>
		<td><form:textarea path="address" /></td>
		</tr>
		 <tr>
		<td>Mobile</td>
		<td><form:textarea path="mobile" /></td>
		</tr>

		<tr>
			<td colspan="2"><input type="submit" /></td>
		</tr>
	</table>
</form:form>

<!-- Displaying the User data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>UserName</td>
		<td>Password</td>
		<td>Customer Name</td>
		<td>Role</td>
		<td>Enabled</td>
		<td>Email</td>
		<td>Address</td>

		<td>Mobile</td>
	</tr>
	<c:forEach items="${supplist}" var="user">
		<tr bgcolor="cyan">
			<td>${user.userName}</td>
			<td>${user.customerName}</td>
			<td>${user.role}</td>
			<td>${user.enabled}</td>
			<td>${user.email}</td>
			<td>${user.address}</td>
			<td>${user.mobile}</td>
			<td><a href="<c:url value="deleteUser/${user.userName}"/>">Delete</a>
				<a href="<c:url value="updateUser/${user.userName}"/>">Update</a></td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->

</body>
</html>