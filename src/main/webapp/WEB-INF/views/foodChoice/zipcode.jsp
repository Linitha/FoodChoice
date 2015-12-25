<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>Enter the Zipcode </h4>
<form:form method="post" commandName="ZipCode">
    <table>
        <tr><td>Zipcode: </td><td><input name="ZipCode" type="textbox"></td></tr>
        <tr><td colspan="2" align="right"><input type="submit" value="Submit"></td></tr>
    </table>
    <div style="color:red">${error}</div>
</form:form>
</body>
</html>
