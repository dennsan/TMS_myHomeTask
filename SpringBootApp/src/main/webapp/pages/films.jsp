
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<a>
<a href="/">Home</a>

    <br>

<%--${film.title}--%>

<c:forEach items="${film}" var="movie">
    <ul>
        <li>${movie.title}</li>
    </ul>
</c:forEach>

</body>
</html>
