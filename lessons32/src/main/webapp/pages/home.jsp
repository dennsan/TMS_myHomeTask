<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/home?lang=ru">RUS</a><br>
<a href="/home?lang=en">ENG</a><br>
<sp:message code="label.title"/><br>

Adding worker to company
<form action="home" method="post">
    <input type="text" name="name"><br>
    ${nameError}<br><br>
    <input type="text" name="major"><br>
    ${majorError}<br><br>
    <input type="submit" value="Add">
</form>

<ul>
   <c:forEach var="worker" items="${workers}">
       <li>
           ${worker.name} - ${worker.major}
       </li>
   </c:forEach>
</ul>

</body>
</html>
