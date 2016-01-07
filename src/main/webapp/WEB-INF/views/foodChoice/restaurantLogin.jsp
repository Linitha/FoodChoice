<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <form:form id="RestaurantLogInForm" method="POST" action="/foodchoice/restaurant/viewOrders" modelAttribute="restaurant" class="small">
                <h3 class="form-heading">Please sign in</h3>
                <label for="loginUserID" class="sr-only">User Name</label>
                <form:input id="loginUserID" path="loginUserID" placeholder="User Name" class="form-control" />
                <label for="loginPassword" class="sr-only">Password</label>
                <form:input id="loginPassword" path="loginPassword" type="password" placeholder="Password" class="form-control" />
                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            </form:form>
        </div>
        <script src="${pageContext.request.contextPath}/resources/js/jquery.1.11.3.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
    </body>
</html>

