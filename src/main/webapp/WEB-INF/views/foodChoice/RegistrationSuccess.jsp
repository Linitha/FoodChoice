<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
            <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <form:form action="/foodchoice/zipcode" method="get" modelAttribute="customer" class="large">
                <h3 class="form-heading">Thank you for registering!</h3>
                <table>
                    <tr colspan="2">
                        <td>Here are the details you have entered:</td>
                    </tr>
                    <tr>
                        <td>First Name:</td>
                        <td>${customer.firstName}</td>
                    </tr>
                    <tr>
                        <td>Last Name:</td>
                        <td>${customer.lastName}</td>
                    </tr>
                    <tr>
                        <td>E-mail:</td>
                        <td>${customer.emailID}</td>
                    </tr>
                    <tr>
                        <td><button class="btn btn-lg btn-primary btn-block" type="submit">Continue</button></td>
                    </tr>
                </table>
            </form:form>
        </div>
    </body>
</html>
