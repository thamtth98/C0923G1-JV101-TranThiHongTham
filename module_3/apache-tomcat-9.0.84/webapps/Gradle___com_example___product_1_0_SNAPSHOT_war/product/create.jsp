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
<h1>Create Product</h1>
<form action="/product" method="post">
    <input type="hidden" name="action" value="create">
    <table>
        <tr>
            <td>ID: </td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>Price: </td>
            <td><input type="text" name="price"></td>
        </tr>
        <tr>
            <td>
                <button type="submit">Add</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
