<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="display-discount" method="post">
    <table>
        <tr>
            <td>Product Description:</td>
            <td><input type="text" placeholder="Product Description"></td>
        </tr>
        <tr>
            <td>List Price:</td>
            <td><input type="number" placeholder="List Price" name="price"></td>
        </tr>
        <tr>
            <td>Discount Percent:</td>
            <td><input type="number" placeholder="Discount Percent" name="percent"></td>
        </tr>
        <tr>
            <td><button>Calculate Discount</button></td>
        </tr>
    </table>
</form>
</body>
</html>
