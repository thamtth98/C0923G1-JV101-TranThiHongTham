<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/2/2024
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User List</h1>
<a href="/user_manage/create.jsp">Create</a><br>
<form action="/user" >
    <input type="hidden" name="action" value="searchUser">
    <input type="text" placeholder="Search country" name="country">
    <button type="submit">Search</button>
</form>

<form action="/user" >
    <input type="hidden" name="action" value="sort">

    <select name="sortOption">
        <option value="asc">Tang dan</option>
        <option value="desc">Giam dan</option>
    </select>
    <button type="submit">Sap xep</button>
</form>

<table>
<thead>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
</tr>
</thead>
    <tbody>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td><a href="/user?action=edit&id=${user.id}">Edit</a></td>
            <td><a href="/user?action=delete&id=${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
