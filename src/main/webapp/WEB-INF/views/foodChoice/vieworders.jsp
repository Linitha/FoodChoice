
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <%@ include file="scriptsAndLinks.jsp" %>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="form large">
    <h3 class="form-heading">List of Orders</h3>
    <table>
            <tr>
                <th>Order Id</th>
                <th>Order Total</th>
                <th>Number Of Items</th>
                <th>Cutomer Email Id</th>
            </tr>
        <c:forEach items="${listOfOrders}" var="order">
            <tr>
                <td>        <c:out value="${order.getOrderID()}"/> </td>
                <td>        <c:out value="${order.getOrderTotal()}"></c:out> </td>
                <td>        <c:out value="${order.getNumberOfItems()}"></c:out> </td>
                <td>        <c:out value="${order.getCustomerEmailID()}"></c:out></td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
