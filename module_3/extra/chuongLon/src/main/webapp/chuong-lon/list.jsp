<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2024
  Time: 3:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <a href="/lon?action=create">Tạo mới lợn con:</a>
    <tr>
        <th>idLon</th>
        <th>tenLon</th>
        <th>trongLuong</th>
        <th>tuoi</th>
        <th>gioiTinh</th>
        <th>chuongHienTai</th>
    </tr>
    <c:forEach items="${lonList}" var="lon">
        <tr>
            <td>${lon.idLon}</td>
            <td>${lon.tenLon}</td>
            <td>${lon.trongLuong}</td>
            <td>${lon.tuoi}</td>
            <td>${lon.gioiTinh}</td>
            <td>${lon.chuongHienTai}</td>
            <td><a href="/lon?action=edit&id=${lon.idLon}">Chỉnh sửa</a></td>
            <td><a href="/lon?action=delete&id=${lon.idLon}">Xóa</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
