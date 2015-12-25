
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
        <title>Payment Details</title>
    </head>
    <body>
        <h1>Payment Details</h1>
        <form:form method="POST" action="/payment" modelAttribute="payment">
            <div>
                <label>First Name: </label>
                <form:input path="firstName" type="text" />
            </div>
            <div>
                <label>Last Name: </label>
                <form:input path="lastName" type="text" />
            </div>
            <div>
                <label>Credit Card Number: </label>
                <form:input path="creditCardNumber" type="text" />
            </div>
            <div>
                <label>Expiration Date: </label>
                <form:input path="month" type="text" /> - <form:input path="year" type="text" />
            </div>
            <div>
                <td><input type="submit" name="submit" value="Order" /></td>
            </div>
        </form:form>
    </body>
</html>