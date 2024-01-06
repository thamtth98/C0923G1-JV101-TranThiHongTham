<%--
  Created by IntelliJ IDEA.
  User: trant
  Date: 03/01/2024
  Time: 10:28 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/person" method="post">
    <input type="hidden" name="action" value="edit">
    <div>
        Person Id: <input type="text" readonly name="personId" value="${person.personId}">
    </div>
    <div>
        Last Name: <input type="text" name="lastName" value="${person.lastName}">
    </div>
    <div>
        First Name: <input type="text" name="firstName" value="${person.firstName}">
    </div>
    <div>
        Address: <input type="text" name="address" value="${person.address}">
    </div>
    <div>
        City: <input type="text" name="city" value="${person.city}">
    </div>
    <div>
        <button type="submit" class="btn btn-success">Save</button>
    </div>
</form>
</body>
</html>
