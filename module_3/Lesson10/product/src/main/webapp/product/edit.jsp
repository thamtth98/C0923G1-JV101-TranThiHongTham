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
<h1>Edit Product</h1>
<form action="product" method="post">
    <input type="hidden" name="action" value="edit">
    <table>
        <tr>
            <td>ID: </td>
            <td><input type="text" name="id" value="${productEdit.id}"></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name" value="${productEdit.name}"></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="text" name="price" value="${productEdit.price}"></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Save</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
