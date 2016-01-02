
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <%@ include file="scriptsAndLinks.jsp" %>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="form large">
    <h3 style="margin:0 auto;" align="center" class="form-heading">Orders Details</h3>
    <table class = table>
        <tr>
            <th>Item</th>
            <th>Quantity</th>
            <th>Price</th>
        </tr>
        <c:forEach items="${listOfFoodOrders}" var="foodOrders">
            <tr>
                <td>        <c:out value="${foodOrders.getItem()}"/> </td>
                <td>        <c:out value="${foodOrders.getQuantity()}"></c:out> </td>
                <td>        <c:out value="${foodOrders.getPrice()}"></c:out> </td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>

