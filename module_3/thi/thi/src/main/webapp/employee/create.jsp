<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/6/2024
  Time: 11:29 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<h2>Create employee</h2>
<h4><a href="/employee">List Employee</a></h4>
<form action="/employee" method="post" class="m-5">
    <input type="hidden" name="action" value="create">

    <input type="hidden" name="idEmployee" class="form-control">

    <div class="mb-3">
        <label class="form-label">Name:</label>
        <input type="text" name="name" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">Email:</label>
        <input type="text" name="email" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">Address:</label>
        <input type="text" name="address" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">Phone Number:</label>
        <input type="text" name="phoneNumber" class="form-control">
    </div>
    <div class="mb-3">
        <label class="form-label">Salary:</label>
        <input type="text" name="salary" class="form-control">
    </div>
<%--    <div class="mb-3">--%>
<%--        <label class="form-label">Name Department:</label>--%>
<%--        <input type="text" name="nameDepartment" class="form-control">--%>
<%--    </div>--%>

        <input type="hidden" name="action" value="nameDepartment">
        <select name="nameDepartment">
<%--            <c:forEach items="${employeeList}" var="employee">--%>
<%--                <option value="${employee.idEmployee}">${employee.nameDepartment}</option>--%>
<%--            </c:forEach>--%>
            <option value="">

            </option>
        </select>



    <button type="submit" class="btn btn-primary">Save</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
