<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
</head>
<body>
<h1> List Product</h1>
<table border="1">
    <tr>
        <th>prodname</th>
        <th>descriptions</th>
        <th>dateofmanf</th>
        <th>price</th>
    </tr>
    <c:forEach var="products" items="${product}" varStatus="loop">
        <tr>
            <td>${products.getProdname()}</td>
            <td>${products.getDescriptions()}</td>
            <td>${products.getDateofmanf()}</td>
            <td>${products.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>