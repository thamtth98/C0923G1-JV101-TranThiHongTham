<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <input type="text" name="nameSearch" placeholder="Search name">
    <button><a href="/product?action=findByName">Search</a></button>
<table border="1px" style="border-collapse: collapse">
    <thead>
    <tr>
        <th>STT</th>
        <th>Name product</th>
        <th>Price</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productList}" var="product">
    <tr>
        <td>${product.id}</td>
        <td>${product.name}</td>
        <td>${product.price}</td>
        <td>
            <button><a href="/product?action=view&id=${product.id}">Detail</a></button>
        </td>
        <td>
            <button><a href="/product?action=edit&id=${product.id}">Edit</a></button>
        </td>
        <td>
            <button><a href="/product?action=delete&id=${product.id}">Remove</a></button>
        </td>
        </c:forEach>
    </tr>
    </tbody>
</table>
<button><a href="/product?action=create">Add new</a></button>
</body>
</html>
