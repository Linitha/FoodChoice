
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <h3>List of Restaurants</h3>
        <table style="width:100%">
            <ul>
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
            </ul>
        </table>
        <!--<form:form method="POST" action="/foodchoice/order" modelAttribute="listOfRestaurants">
            <h3 class="form-heading">Select a Restaurant</h3>
            <form:select id="restaurantName" name="restaurantName" items="${listOfRestaurants}">
            </form:select>
        </form:form>-->
    </body>
</html>
