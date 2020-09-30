<%--
  Created by IntelliJ IDEA.
  User: dkasarap
  Date: 9/14/2020
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/background.css">
    <title>FinaL Bill</title>
</head>
<body>
<div class="header">
    <h1>Thank You</h1>
</div>
<table align="center" border="1">
    <tr>
        <th>Order</th>
        <th>Price</th>
    </tr>

    <tr>
        <td align="center">Coffee</td>
        <td align="center">${CofeePrice}</td>
    </tr>
    <tr>
        <td align="center">AddOn</td>
        <td align="center">${AddonPrice}</td>
    </tr>
    <tr>
        <td align="center">Size</td>
        <td align="center">${SizePrice}</td>
    </tr>
    <tr>
        <td align="center">Coupon</td>
        <td align="center">${DiscountPrice}</td>
    </tr>
    <tr>
        <td align="center">Total</td>
        <td align="center">${Bill}</td>
    </tr>
</table>
<div class="links">
    <br>
    <a href="./">Home</a>
</div>
</body>
</html>
