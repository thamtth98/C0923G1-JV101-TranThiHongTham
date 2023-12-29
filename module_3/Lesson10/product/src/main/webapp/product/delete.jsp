<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 12/28/2023
  Time: 9:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Delete Product</h1>
<form action="product" method="post">
    <input type="hidden" name="action" value="delete">
    <table>
        <tr>
            <td>ID:</td>
            <td>
                <input type="text" name="id" value="${productDel.id}" readonly></td>
        </tr>
        <tr>
            <td>Name:</td>
            <td>${productDel.name}</td>
        </tr>
        <tr>
            <td>Price:</td>
            <td>${productDel.price}</td>
        </tr>
        <tr>
            <td>
                <button type="submit">Delete</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
