<%@ page import="java.util.List" %>
<%@ page import="org.tms.lessons24.Book" %>
<%@ page import="org.tms.lessons24.Database" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>

<style>
    table, th, td {
        border: 1px solid black;
    }
</style>
<body>
<form action="/search" method="post">
    Author:<input type="text" name="author">

    <input type="submit" value="Search">
</form>

<br>
<br>

<form action="/add" method="post">
    Author:<input type="text" name="author">
    <br>
    <br>
    Title: <input type="text" name="title">
    <br>
    <br>
    Category:<input type="text" name="category">
    <br>
    <br>
    <input type="submit" value="Add">
</form>
<table>
    <tr>
        <th>Author</th>
        <th>Title</th>
        <th>Category</th>
    </tr>

    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.getAuthor()}</td>
            <td>${book.getTitle()}</td>
            <td>${book.getCategory()}</td>
        </tr>
    </c:forEach>

</table>


</body>
</html>
