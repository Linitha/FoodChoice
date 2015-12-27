
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="form large">
            <h3 class="form-heading">List of Restaurants</h3>
            <table>
                <c:forEach items="${listOfRestaurants}" var="restaurant">
                    <tr>
                        <td>
                            <c:out value="${restaurant.restaurantName}"/>
                        </td>
                        <td>
                            <spring:url value="/restaurant/${restaurant.restaurantID}" var="restaurantUrl" />
                            <button class="btn btn-info" onclick="location.href='${restaurantUrl}'">Get Menu</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <!--<form:form method="POST" action="/foodchoice/order" modelAttribute="listOfRestaurants">
                <h3 class="form-heading">Select a Restaurant</h3>
                <form:select id="restaurantName" name="restaurantName" items="${listOfRestaurants}">
                </form:select>
            </form:form>-->
        </div>
    </body>
</html>
