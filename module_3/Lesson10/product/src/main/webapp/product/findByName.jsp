<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/29/2023
  Time: 11:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="1px" style="border-collapse: collapse">
    <thead>
    <tr>
        <th>STT</th>
        <th>Name product</th>
        <th>Price</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productListByName}" var="products">
    <tr>
        <td>${products.id}</td>
        <td>${products.name}</td>
        <td>${products.price}</td>
        </c:forEach>
    </tr>
    </tbody>
</table>

</body>
</html>
