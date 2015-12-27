
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <form:form method="POST" action="/foodchoice/order" modelAttribute="order" class="large">
            <h3 class="form-heading">Menu</h3>
                <table>
                    <tr>
                        <th>Select</th>
                        <th>Item</th>
                        <th>Price</th>
                    </tr>
                    <c:forEach items="${order.getItems()}" var="item">
                        <tr>
                            <td> <form:checkbox path ="selectedItems" value="${item.getItemID()}" /> </td>
                            <td> <c:out value="${item.getItemName()}"/>  </td>
                            <td> <c:out value="${item.getPrice()}"/>  </td>
                        </tr>
                    </c:forEach>
                    <tr>
                        <td><button class="btn btn-lg btn-primary btn-block" type="submit">Order</button></td>
                    </tr>
                </table>
            </form:form>
        </div>
    </body>
</html>