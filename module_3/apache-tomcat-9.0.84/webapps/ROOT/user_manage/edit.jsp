<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/2/2024
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>
    <a href="/user">List All Users</a>
</h2>
<h1>Edit User</h1>
<form action="/user" method="post">
    <input name="action" value="editUser" type="hidden">
    <table>
        <tr>
            <td>ID User: </td>
            <td><input type="text" name="id" value="${user.getId()}"> </td>
        </tr>
        <tr>
            <td>Name User: </td>
            <td><input type="text" name="name" value="${user.getName()}"> </td>
        </tr>
        <tr>
            <td>Email: </td>
            <td><input type="text" name="email" value="${user.getEmail()}"> </td>
        </tr>
        <tr>
            <td>Country: </td>
            <td><input type="text" name="country" value="${user.getCountry()}"> </td>
        </tr>
        <tr>
            <td><input type="submit" value="Edit"> </td>
        </tr>
    </table>
</form>
</body>
</html>
