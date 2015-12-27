<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <%@ include file="scriptsAndLinks.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <div class="container">
            <form:form method="post" action ="/foodchoice/restaurant" commandName="ZipCode">
                <h3 class="form-heading">Enter Zip Code</h3>
                <label for="ZipCode" class="sr-only">User Name</label>
                <input id="ZipCode" name="ZipCode" class="form-control" placeholder="Zip Code" required autofocus>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
                <div style="color:red">${error}</div>
            </form:form>
        </div>
    </body>
</html>
