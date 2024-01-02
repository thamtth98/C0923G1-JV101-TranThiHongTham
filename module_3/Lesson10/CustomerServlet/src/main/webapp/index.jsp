<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border-bottom: 1px solid #dddddd;
            text-align: left;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
            height: 80px;
        }
        h2{
            text-align: center;
        }
    </style>
</head>
<body>
<h2>Danh sách khách hàng</h2>
<table>
    <thead>
    <tr>
        <th scope="col">Tên</th>
        <th scope="col">Ngày sinh</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Hình ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.getNameCustomer()}</td>
            <td>${customer.getBirthday()}</td>
            <td>${customer.getAddress()}</td>
            <td><img src="${customer.getUrlImage()}" alt="avatar" width="60px" height="60px"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
