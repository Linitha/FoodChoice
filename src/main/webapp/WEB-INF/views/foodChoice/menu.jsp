
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <style>
            body {
                background-color: linen;
            }
            h1 {
                color: maroon;
                margin-left: 40px;
            }
        </style>
        <title>This is Menu</title>
    </head>
    <body>
        <h1>Menu</h1>
        <form:form method="POST" commandName="order">
            <table style="width:100%">
                <tr>
                    <td> <h1>Item</h1> </td>
                    <td> <h1>Price</h1> </td>
                </tr>
                <c:forEach items="${order.getItems()}" var="item" >
                    <tr>
                        <td> <c:out value="${item.getName()}"/>  </td>
                        <td> <c:out value="${item.getPrice()}"/>  </td>
                        <%--<td> <form:checkbox path ="selected" value="${item.getName()}"/> </td>--%>
                    </tr>
                </c:forEach>
                <%--<tr>--%>
                    <%--<ul>--%>
                    <%--<form:checkboxes element="li" path="items" items="${order.getItems()}">--%>
                    <%--</form:checkboxes>--%>
                    <%--</ul>--%>
                <%--</tr>--%>
                <tr>
                   <td><input type="submit" name="submit" value="Order" /></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>