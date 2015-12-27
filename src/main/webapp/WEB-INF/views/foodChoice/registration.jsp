<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <form:form action="/foodchoice/register" method="post" modelAttribute="customer" class="small">
                <h3 class="form-heading">Customer Registration</h3>
                <label for="firstName" class="sr-only">User Name</label>
                <input id="firstName" name="firstName" class="form-control" placeholder="First Name" required autofocus>
                <label for="lastName" class="sr-only">User Name</label>
                <input id="lastName" name="lastName" class="form-control" placeholder="Last Name" required>
                <label for="emailID" class="sr-only">User Name</label>
                <input id="emailID" name="emailID" class="form-control" placeholder="E-mail" required type="email">
                <label for="password" class="sr-only">User Name</label>
                <input id="password" name="password" class="form-control" placeholder="Password" required>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>
            </form:form>
        </div>
    </body>
</html>