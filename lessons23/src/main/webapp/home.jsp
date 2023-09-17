<%@ page import="java.util.List" %>
<%@ page import="org.tms.lessons23.Book" %>
<%@ page import="org.tms.lessons23.Database" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<style>
    table, th, td {
        border:1px solid black;
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
    <tr>  <th>Author</th>
        <th>Title</th>
        <th>Category</th></tr>

    <%
        Object attribute = request.getAttribute("books");
        if(attribute!=null) {
            List<Book> books = (List<Book>) request.getAttribute("books");
            for (Book book : books) {

                out.println("<tr><td>"+book.getAuthor()+"</td>"+ "<td>"+book.getTitle()+"</td>" + "<td>"+book.getCategory()+"</td></tr");

            }
        }
    %>
</table>



</body>
</html>
