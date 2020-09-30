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
    <title>Show Coffees</title>

    <script>
        function validateForm() {
            var x = document.forms["myForm"]["coffeeId"].value;
            if (x == "" || x == null) {
                alert("Coffee ID must be filled out");
                return false;
            }
        }
    </script>
</head>
<body>
<div class="header">
    <h1>Coffee</h1>
</div>
<table border="1" align="center">
    <tr>
        <th>CoffeeID</th>
        <th>Coffee Name</th>
        <th>Price</th>
    </tr>
<c:forEach var = "coffee" items = "${coffeeList}">
    <tr>
        <td align="center">${coffee.coffeeID}</td>
        <td align="center">${coffee.coffeeName}</td>
        <td align="center">${coffee.price}</td>
    </tr>
</c:forEach>
</table>
<form name="myForm" action="./showAddOn" method="post" onsubmit="return validateForm()" required>
    <input type="text" name="coffeeId" placeholder="Enter Coffee ID">
    <input type="submit" value="Show AddOns">
</form>
</body>
</html>
