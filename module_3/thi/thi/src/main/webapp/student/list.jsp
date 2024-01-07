<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/6/2024
  Time: 10:56 PM
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
<table class="table table-hover">
    <tr>
        <th>ID</th>
        <th>Last Name</th>
        <th>First Name</th>
        <th>Address</th>
        <th>City</th>
        <th>Delete</th>
        <th>Edit</th>
    </tr>
    <c:forEach items="${personList}" var="person">
        <tr>
            <td>${person.personId}</td>
            <td>${person.lastName}</td>
            <td>${person.firstName}</td>
            <td>${person.address}</td>
            <td>${person.city}</td>
            <td>
                <button type="button" class="btn btn-warning" onclick="handleShowDelete('${person.personId}','${person.firstName}')"
                        data-mdb-ripple-init data-mdb-modal-init data-mdb-target="#deleteModal">Delete</button>
            </td>
            <td>
                <a href="/person?action=showFormEdit&personId=${person.personId}" class="btn btn-danger">Edit</a>
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
    function handleShowDelete(id, firstName) {
        document.getElementById("content-delete").innerText = "Bạn chắc chắn muốn xóa " + firstName + " không?";
        document.getElementById("confirm-delete").href = "/person?action=delete&personId=" + id;
    }
</script>
<!-- MDB -->
<script
        type="text/javascript"
        src="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/7.1.0/mdb.umd.min.js"
></script>
</body>
</html>
