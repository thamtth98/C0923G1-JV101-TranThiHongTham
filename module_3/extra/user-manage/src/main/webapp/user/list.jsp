<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/7/2024
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <!-- Font Awesome -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css"
            rel="stylesheet"
    />
    <!-- Google Fonts -->
    <link
            href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap"
            rel="stylesheet"
    />
    <!-- MDB -->
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.min.css"
            rel="stylesheet"
    />
</head>
<body>
<h6><a href="/user?action=create">Create</a></h6>
<form action="/user" class="mb-3">
    <input type="hidden" name="action" value="search">
    <label class="form-label">Search:</label>
    <input type="text" name="search" class="form">
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
<table class="table table-hover">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Country</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${userList}" var="user">
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.country}</td>
            <td>
                <button type="button" class="btn btn-warning" onclick="handleShowDelete('${user.id}','${user.name}')"
                        data-mdb-ripple-init data-mdb-modal-init data-mdb-target="#deleteModal">Delete</button>
            </td>
            <td>
                <a href="/user?action=edit&id=${user.id}" class="btn btn-danger">Edit</a>
            </td>
        </tr>
    </c:forEach>
</table>

<!-- Modal -->
<div class="modal fade" id="deleteModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Cánh báo!!</h5>
                <button type="button" class="btn-close" data-mdb-ripple-init data-mdb-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <div id="content-delete"></div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-mdb-ripple-init data-mdb-dismiss="modal">Close</button>
                <a href="" id="confirm-delete" type="button" class="btn btn-danger" data-mdb-ripple-init>Delete</a>
            </div>
        </div>
    </div>
</div>
<script>
    function handleShowDelete(id, name) {
        document.getElementById("content-delete").innerText = "Bạn chắc chắn muốn xóa " + name + " không?";
        document.getElementById("confirm-delete").href = "/user?action=delete&id=" + id;
    }
</script>
<!-- MDB -->
<script
        type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.umd.min.js"
></script>
</body>
</html>