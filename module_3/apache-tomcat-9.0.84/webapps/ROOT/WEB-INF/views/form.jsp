<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/11/2024
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/calculator/calculate" method="post">
    <h2>Calculator</h2>
    <input type="number" name="firstNumber" value="${firstNumber}">
    <input type="number" name="secondNumber" value="${secondNumber}"><br><br>
    <button type="submit" name="operator" value="add">Addition(+)</button>
    <button type="submit" name="operator" value="sub">Subtraction(-)</button>
    <button type="submit" name="operator" value="mul">Multiplication(X)</button>
    <button type="submit" name="operator" value="div">Division(/)</button>
</form>
<h3>Result ${operator}: ${result}</h3>

<%--<script>--%>
<%--    function calculate(number) {--%>
<%--        switch (number) {--%>
<%--            case 1:--%>
<%--                break;--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>
