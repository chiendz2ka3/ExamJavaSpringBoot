<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer form</title>
</head>
<body>
<h1> List Customer</h1>
<table border="1">
    <tr>
        <th>SalesmanName</th>
        <th>Sino</th>
        <th>salemanid</th>
        <th>prodid</th>
    </tr>
    <c:forEach var="sale" items="${sale}" varStatus="loop">
        <tr>
            <td>${sale.getSalesmanName()}</td>
            <td>${customer.getSino()}</td>
            <td>${customer.getSalemanid()}</td>
            <td>${customer.getDos()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>