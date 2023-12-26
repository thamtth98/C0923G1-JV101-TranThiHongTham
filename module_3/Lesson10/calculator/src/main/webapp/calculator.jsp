
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Simple Calculator</h3>
<form action="/calculator" method="post">
<table>
    <tr>
        <td>First operand: </td>
        <td><input name="first-number" type="number"></td>
    </tr>
    <tr>
        <td>Operator: </td>
        <td>
            <select name="operator">
                <option value="+">Addition</option>
                <option value="-">Subtraction</option>
                <option value="*">Multiplication</option>
                <option value="/">Division</option>
            </select>
        </td>
    </tr>
    <tr>
        <td>Second operand: </td>
        <td><input name="second-number" type="number"></td>
    </tr>
    <tr>
        <td></td>
        <td>
            <button>Calculate</button>
        </td>
    </tr>
</table>
</form>
</body>
</html>
