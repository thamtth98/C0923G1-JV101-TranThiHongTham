<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 1/12/2024
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <style>
        tr{
            line-height: 30px;
        }
        #btn-up{
            background-color: bisque;
        }
    </style>
</head>
<body>
<h2>Settings</h2>
<form:form action="/mail/edit" method="post" modelAttribute="mail">
    <table>
        <tr>
            <td>Languages</td>
            <td><form:select path="languages">
                <form:options items="${listLanguage}"></form:options>
            </form:select></td>
        </tr>
        <tr>
            <td>Page Size:</td>
            <td>Show
                <form:select path="pageSize">
                    <form:options items="${listPageSize}"></form:options>
                </form:select>
                emails per page
            </td>
        </tr>
        <tr>
            <td>Spams filter:</td>
            <td>
                <form:checkbox path="spamsFilter"></form:checkbox>
                Enable spams filter
            </td>
        </tr>
        <tr>
            <td>Signature:</td>
            <td>
                <form:textarea path="signature"></form:textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <form:button value="Update" id="btn-up">Update</form:button>
                <form:button value="Cancel">Cancel</form:button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
