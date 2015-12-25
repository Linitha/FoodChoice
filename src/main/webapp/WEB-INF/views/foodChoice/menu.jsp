
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
        <form:form method="POST" action="/foodchoice/order" modelAttribute="order">
            <table style="width:100%">
                <tr>
                    <td> <h1>Select</h1></td>
                    <td> <h1>Item</h1> </td>
                    <td> <h1>Price</h1> </td>
                </tr>
                <c:forEach items="${order.getItems()}" var="item">
                    <tr>
                        <td> <form:checkbox path ="selectedItems" value="${item.getItemName()}" /> </td>
                        <td> <c:out value="${item.getItemName()}"/>  </td>
                        <td> <c:out value="${item.getPrice()}"/>  </td>
                    </tr>
                </c:forEach>
                <tr>
                   <td><input type="submit" name="submit" value="Order" /></td>
                </tr>
            </table>
        </form:form>
    </body>
</html>