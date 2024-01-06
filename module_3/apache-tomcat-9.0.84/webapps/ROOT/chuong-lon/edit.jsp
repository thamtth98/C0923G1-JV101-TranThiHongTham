<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/6/2024
  Time: 12:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<th>idLon</th>
<th>tenLon</th>
<th>trongLuong</th>
<th>tuoi</th>
<th>gioiTinh</th>
<th>chuongHienTai</th>
<form action="/lon" method="post">
    <input type="hidden" name="action" value="edit">
    <div>
        idLon: <input type="hidden"  name="idLon" value="${lon.idLon}">
    </div>
    <div>
        Tên lợn: <input type="text" name="tenLon" value="${lon.tenLon}">
    </div>
    <div>
        Trọng lượng: <input type="text" name="trongLuong" value="${lon.trongLuong}">
    </div>
    <div>
        Tuổi: <input type="text" name="tuoi" value="${lon.tuoi}">
    </div>
    <div>
        Giới tính: <input type="text" name="gioiTinh" value="${lon.gioiTinh}">
    </div>
    <div>
        Chuồng hiện tại: <input type="text" name="chuongHienTai" value="${lon.chuongHienTai}">
    </div>
    <div>
        <button type="submit" class="btn btn-success">Save</button>
    </div>
</form>
</body>
</html>
