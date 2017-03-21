<%--
  Created by IntelliJ IDEA.
  User: Victoria Owen
  Date: 3/16/2017
  Time: 10:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
<table border=1>
<c:forEach var="myvar" items="${cList}">
    <tr>
        <td> ${myvar.name}</td>
        <td> ${myvar.address}</td>
        <td><a href="delete?id=${myvar.name}" onclick="return confirm('Are you sure?')"> Delete </a></td>
    </tr>
</c:forEach>
</table>

<form action="addPerson" method="post">
    Name: <input type=" text" name =name>
    Address: <input type=" text" name =address>

    <input type="submit" value="submit">
</form>

<br>
<br>

<a href="welcome">Welcome!</a><br>
<a href="listStudents">Student Page</a><br>
<a href="listStaff">Staff Page</a><br>
</body>
</html>
<!--return confirm('Are you sure?'); -->