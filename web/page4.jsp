<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page4</title>
</head>
<body>
<c:forEach var = "page" items = "${pages}">
            <c:out value="${page.uri}" />
            <c:out value="${page.title}" />
            <hr>
</c:forEach>
</body>
</html>
