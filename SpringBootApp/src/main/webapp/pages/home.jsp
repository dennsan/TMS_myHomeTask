<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <label>Title</label>
    <input type="text" name="title"><br>
    <label for="genre">genre</label>
    <select name="genre" id="genre">
        <c:forEach items="${genres}" var="genre">
            <option value="${genre.name()}">
                    ${genre.name()}
            </option>
        </c:forEach>
    </select>

    <br>
    <label>age</label>
    <input type="number" name="age"><br>
    <label>rating</label>
    <input type="text" name="rating"><br>
    <input type="submit" value="Save">
</form>

<form action="/get" method="get">
    <input type="number" name="id">
    <input type="submit" value="Find">
</form>

<form action="/get_title" method="get">
    <input type="text" name="title">
    <input type="submit" value="Find">
</form>

${film.title}

<c:forEach items="${films}" var="movie">
    <ul>
        <li>${movie.title}</li>
    </ul>
</c:forEach>

</body>
</html>
