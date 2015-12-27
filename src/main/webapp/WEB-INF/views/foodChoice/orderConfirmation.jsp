
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form:form method="POST" action="/foodchoice/payment" modelAttribute="payment" class="large">
            <h3 class="form-heading">Purchase Confirmed!</h3>
        </form:form>
    </body>
</html>