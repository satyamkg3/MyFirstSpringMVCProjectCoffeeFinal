<%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/14/2020
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="../resources/background.css">
    <title>Show Discount</title>
</head>
<body>
<div class="header">
    <h1>Offers</h1>
</div>
<table border="1" align="center">
    <tr>
        <th>Coupon-ID</th>
        <th>Coupon Name</th>
        <th>Minimum Cost</th>
        <th>Percentage</th>
    </tr>

<c:forEach var = "discount" items = "${discountList}">
    <tr>
        <td align="center">${discount.couponID}</td>
        <td align="center">${discount.couponName}</td>
        <td align="center">${discount.minCost}</td>
        <td align="center">${discount.percentage}</td>
    </tr>
</c:forEach>
</table>

<form action="./coffeeOrder" method="post">
    <input type="text" name="discountId" placeholder="Enter Coupon Id">
    <input type="submit" value="Generate Bill">
</form>
</body>
</html>
