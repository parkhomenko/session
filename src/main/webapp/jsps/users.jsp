<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <body>
    <c:forEach items="${users}" var="us">
        <p>
            <c:out value="${us.name}" />
            <c:out value="${us.age}" />
        </p>
    </c:forEach>
    </body>
</html>
