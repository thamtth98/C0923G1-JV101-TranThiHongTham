<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/10/2024
  Time: 5:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate/vietnamese">
  <table>
    <tr>
      <td>Nhập từ tiếng Anh</td>
      <td><input type="text" name="english" value="${english}"></td>
    </tr>
    <tr>
      <td>Nghĩa tiếng Việt: </td>
      <td>${result}</td>
    </tr>
    <tr>
      <td><button type="submit">Dich</button></td>
    </tr>
  </table>
</form>
</body>
</html>
