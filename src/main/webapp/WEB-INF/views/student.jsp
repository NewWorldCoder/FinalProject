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
    <title>Student</title>
</head>

<body>
<table border=1>
    <c:forEach var="myvar" items="${cList}">
        <tr>
            <td> ${myvar.studentId}</td>
            <td> ${myvar.name}</td>
            <td> ${myvar.address}</td>
            <td> ${myvar.program}</td>
            <td> ${myvar.year}</td>
            <td> ${myvar.fee}</td>
            <td><a href="deleteStudent?id=${myvar.studentId}" onclick="return confirm('Are you sure?')"> Delete </a></td>
        </tr>
    </c:forEach>
</table>
<form action="addStudent" method="post">
    StudentID:<input type=int name =studentId>
    Name: <input type=" text" name =name>
    Address: <input type=" text" name =address>
    Program: <input type=" text" name =program>
    Year: <input type=" text" name =year>
    Fee: <input type= decimal name =fee>
    <input type="submit" value="submit">
</form>
<br>
<br>

<a href="welcome">Welcome!</a><br>
<a href="listPerson">Student Page</a><br>
<a href="listStaff">Staff Page</a><br>


</body>
</html>
