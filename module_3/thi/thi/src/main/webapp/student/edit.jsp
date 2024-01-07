<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/6/2024
  Time: 10:59 PM
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
<h2>Edit student</h2>
<h4><a href="/student">List student</a></h4>
<form action="/person" method="post" class="m-5">
    <input type="hidden" name="action" value="edit">

    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Person Id:</label>
        <input class="form-control" id="exampleInputEmail1" type="text" readonly name="personId"
               value="${person.personId}">
    </div>
    <div class="mb-3">
        <label class="form-label">Last Name:</label>
        <input type="text" name="lastName" value="${person.lastName}" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">First Name:</label>
        <input type="text" name="firstName" value="${person.firstName}" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">Address:</label>
        <input type="text" name="address" value="${person.address}" class="form-control">
    </div>

    <div class="mb-3">
        <label class="form-label">City:</label>
        <input type="text" name="city" value="${person.city}" class="   form-control">
    </div>

    <button type="submit" class="btn btn-primary">Save</button>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
</body>
</html>
