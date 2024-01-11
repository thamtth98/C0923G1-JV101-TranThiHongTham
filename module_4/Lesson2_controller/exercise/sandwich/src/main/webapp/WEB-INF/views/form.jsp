<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/11/2024
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Sandwich Condiments</h3>
<form action="/sandwich/list" method="get">
    <input type="checkbox" name="item" value="Lettuce">Lettuce
    <input type="checkbox" name="item" value="Tomato">Tomato
    <input type="checkbox" name="item" value="Mustard">Mustard
    <input type="checkbox" name="item" value="Sprouts">Sprouts
    <button type="submit">Save</button>
</form>
<h3 id="result">Your choice:</h3>
<c:forEach items="${condiments}" var="condiment">
    <div>${condiment}</div>
</c:forEach>
</body>
</html>
