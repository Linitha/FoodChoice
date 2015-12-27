
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <form:form method="POST" action="/foodchoice/payment" modelAttribute="payment" class="small">
            <h3 class="form-heading">Payment Details</h3>
            <label for="userName" class="sr-only">First Name</label>
            <form:input path="firstName" type="text" id="firstName" class="form-control" placeholder="First Name"/>
            <label for="lastName" class="sr-only">Last Name</label>
            <form:input path="lastName" type="text" id="lastName" class="form-control" placeholder="Last Name" />
            <label for="creditCardNumber" class="sr-only">Credit Card Number</label>
            <form:input path="creditCardNumber" type="text" id="creditCardNumber" class="form-control" placeholder="Credit Card Number" />
            <label for="month" class="sr-only">Expiration Month</label>
            <form:input path="month" type="text" id="month" class="form-control" placeholder="Expiration Month" />
            <label for="year" class="sr-only">Expiration Year</label>
            <form:input path="year" type="text" class="form-control" id="year" placeholder="Expiration Year" />
            <button class="btn btn-lg btn-primary btn-block" type="submit">Make Payment</button>
        </form:form>
    </body>
</html>