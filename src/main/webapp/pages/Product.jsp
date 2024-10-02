<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product</title>
<style>
.err
{
color:red
}
</style>
</head>
<body>
<h1>PRODUCT DETAILS</h1>
<form:form action="	product" modelAttribute="product" method="post">
<table>
<tr>
<td>ProductId</td>
<td><form:input path="productId"/></td>
<td><form:errors path="productId" cssClass="err"/></td>
</tr>
<tr>
<td>ProductName</td>
<td><form:input path="productName"/></td>
<td><form:errors path="productName" cssClass="err"/></td>
</tr>
<tr>
<td>ProductPrice</td>
<td><form:input path="productPrice"/></td>
<td><form:errors path="productPrice" cssClass="err"/></td>
</tr>
<tr><td><input type="submit" value="save"/></td></tr>
</table>
</form:form>

</body>
</html>