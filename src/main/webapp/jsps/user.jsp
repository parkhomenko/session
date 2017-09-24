<%@ page import="com.hillel.servlets.User" %>

<html>
    <body>
        <%
            User user = (User) request.getAttribute("user");
        %>

        <p>
            <%= user.getName() %>
        </p>
    </body>
</html>
