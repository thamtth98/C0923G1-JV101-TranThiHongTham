<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/12/2024
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Settings</h2>
<form>
    <table>
        <tr>
            <td>Languages</td>
            <td>${languages}</td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>Show ${pageSize} emails per page
            </td>
        </tr>
        <tr>
            <td>Spams filter: </td>
            <td> ${spamsFilter} Enable spams filter
            </td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>${signature}</td>
        </tr>
    </table>
</form>
</body>
</html>
