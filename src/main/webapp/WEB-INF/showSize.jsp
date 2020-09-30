<%--
  Created by IntelliJ IDEA.
  User: smishra
  Date: 9/14/2020
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="../resources/background.css">
    <title>Show Size</title>
</head>
<body>
<div class="header">
    <h1>Coffee Size</h1>
</div>
<table border="1" align="center">
    <tr>
        <th>Size-ID</th>
        <th>Size</th>
        <th>Price</th>
    </tr>
<c:forEach var = "size" items = "${sizeList}">
    <tr>
        <td align="center">${size.sizeID}</td>
        <td align="center">${size.sizeName}</td>
        <td align="center">${coffee.price}</td>
    </tr>
    <br><br>
</c:forEach>
</table>

<form action="./showDiscount" method="post">
    <input type="text" name="sizeId" placeholder="Enter Size Id">
    <input type="submit" value="Show Offers">
</form>
</body>
</html>
