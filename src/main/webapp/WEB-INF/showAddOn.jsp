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
    <title>Show AddOns</title>
</head>
<body>
<div class="header">
    <h1>AddOns</h1>
</div>
<table border="1" align="center">
    <tr>
        <th>AddOn-ID</th>
        <th>AddOn Name</th>
        <th>Price</th>
    </tr>

<c:forEach var = "addon" items = "${addonList}">
    <tr>
        <td align="center">${addon.addOnID}</td>
        <td align="center">${addon.addOnName}</td>
        <td align="center">${addon.price}</td>
    </tr>
    <br><br>
</c:forEach>
</table>
<form action="./showSize" method="post">
    <input type="text" name="addonId" placeholder="Enter AddOn ID">
    <input type="submit" value="Show Size">
</form>
</body>
</html>
