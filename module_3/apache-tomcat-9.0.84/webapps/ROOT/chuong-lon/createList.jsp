<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/5/2024
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<h1>User Management</h1>
<h2>
    <a href="/lon">List All Users</a>
</h2>

<div>
    <form method="post" action="/lon?action=create">
        <table border="1" cellpadding="5" style="border-collapse: collapse">
            <caption>
                <h2>Thêm mới lợn</h2>
            </caption>
            <tr>
                <th>Tên lợn:</th>
                <td>
                    <input type="text" name="name" id="name" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Trọng lượng:</th>
                <td>
                    <input type="text" name="weight" id="weight" size="45"/>
                </td>
            </tr>
            <tr>
                <th>Tuổi:</th>
                <td>
                    <input type="text" name="age" id="age" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Giới tính:</th>
                <td>
                    <input type="text" name="gender" id="gender" size="15"/>
                </td>
            </tr>
            <tr>
                <th>Chuồng hiện tại:</th>
                <td>
                    <input type="text" name="chuong" id="chuong" size="15"/>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save"/>
                </td>
            </tr>
        </table>
    </form>
</div>
</html>
