<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/home?lang=ru">RUS</a><br>
<a href="/home?lang=en">ENG</a><br>
<sp:message code="label.title"/><br>

Adding worker to company

<sf:form action="home" method="post" modelAttribute="worker">
    <sf:input path="name"/><br>
    <sf:errors path="name"/><br>
    <sf:input path="major"/><br>
    <sf:errors path="major"/><br>
    <sf:button>Add</sf:button><br>
</sf:form>

<ul>
    <c:forEach var="worker" items="${workers}">
        <li>
                ${worker.name} - ${worker.major}
        </li>
    </c:forEach>
</ul>

</body>
</html>
