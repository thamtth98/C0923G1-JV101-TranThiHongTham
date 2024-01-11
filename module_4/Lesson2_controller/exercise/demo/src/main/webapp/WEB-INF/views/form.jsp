<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/10/2024
  Time: 4:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert/calculate">
    <table>
        <tr>
            <td>Nhập số tiền (USD)</td>
            <td><input type="number" min="0" name="usd" value="${usd}"></td>
        </tr>
        <tr>
            <td>Tỷ giá</td>
            <td><input type="number" min="0" name="rate" value="${rate}"></td>
        </tr>
        <tr>
            <td>Thành tiền (VND)</td>
            <td><input type="number" min="0" name="usd" value="${result}"></td>
        </tr>
        <tr>
            <td><button type="submit">Tinh</button></td>
        </tr>
    </table>
</form>
</body>
</html>
