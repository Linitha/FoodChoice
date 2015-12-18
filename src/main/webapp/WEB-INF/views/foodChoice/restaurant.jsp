
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <title>This is List of Restaurant</title>
</head>
<body>
<h1>The List of restaurants</h1>
<table style="width:100%">


    <ul>
        <c:forEach items="${listOfRestaurant}" var="restaurant" >
            <tr> <td> <c:out value="${restaurant}"/>  </td>
                <td>
                    <spring:url value="/restaurant/${restaurant}" var="restaurantUrl" />
                    <button class="btn btn-info"
                            onclick="location.href='${restaurantUrl}'">Get Menu</button>
                </td>

            </tr>
        </c:forEach>
    </ul>

    </table>



</body>
</html>
