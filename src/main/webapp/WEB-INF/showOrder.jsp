<%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/15/2020
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Confirm Order</title>
    <link rel="stylesheet" href="../resources/background.css">
</head>
<body>
<div class="header">
    <h1>Your Order</h1>
</div>
<table border="1" align="center">
    <tr>
        <th>Coffee</th>
        <th>AddOn</th>
        <th>Size</th>
        <th>Offer</th>
    </tr>
    <tr>
        <td align="center">${coffee.getCoffeeById(sessionScope.coffeeId).coffeeName}</td>
        <td align="center">${addon.getAddOnById(sessionScope.addonId).addOnName}</td>
        <td align="center">${size.getSizeById(sessionScope.sizeId).sizeName}</td>
        <td align="center">${discount.getCouponById(sessionScope.discountId).couponName}</td>
    </tr>
</table>

<form action="./generateBill" method="post">
    <input type="submit" value="Confirm Order">
</form>

</body>
</html>
