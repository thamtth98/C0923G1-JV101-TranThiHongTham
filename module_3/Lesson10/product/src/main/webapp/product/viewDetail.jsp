<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/29/2023
  Time: 9:46 AM
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
        <th>Describe</th>
        <th>Producer</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>${product.describe}</td>
        <td>${product.producer}</td>

    </tr>
    </tbody>
</table>
</body>
</html>
