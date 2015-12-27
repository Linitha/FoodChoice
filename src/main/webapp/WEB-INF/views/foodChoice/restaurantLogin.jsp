
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="scriptsAndLinks.jsp" %>
</head>
<body>
<%@ include file="header.jsp" %>
<div class="container">
    <form:form method="GET" name="loginForm" action="/foodchoice/zipcode">
        <h3 class="form-heading">Please sign in</h3>
        <label for="userName" class="sr-only">User Name</label>
        <input id="userName" class="form-control" placeholder="User Name" required autofocus>
        <label for="password" class="sr-only">Password</label>
        <input type="password" id="password" class="form-control" placeholder="Password" required>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
        <div style="color:red">${error}</div>
    </form:form>
</div>
<script src="${pageContext.request.contextPath}/resources/js/jquery.1.11.3.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
>>>>>>> Stashed changes

