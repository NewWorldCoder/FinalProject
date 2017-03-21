<%--
  Created by IntelliJ IDEA.
  User: Victoria Owen
  Date: 3/16/2017
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c" %>
<html>
<head>
    <title>Staff</title>
</head>
<body>
<table border=1>
    <c:forEach var="myvar" items="${cList}">
        <tr>
            <td> ${myvar.staffId}</td>
            <td> ${myvar.name}</td>
            <td> ${myvar.address}</td>
            <td> ${myvar.school}</td>
            <td> ${myvar.monthlySalary}</td>
            <td><a href="deleteStaff?id=${myvar.staffId}" onclick="return confirm('Are you sure?')"> Delete </a></td>
            </tr>
    </c:forEach>
</table>
<form action="addStaff" method="post">
    StaffID:<input type=int name =staffId>
    Name: <input type=" text" name =name>
    Address: <input type=" text" name =address>
    School: <input type=" text" name =school>
    MonthlySalary: <input type=decimal name =monthlySalary>
    <input type="submit" value="submit">
</form>

<a href="welcome">Welcome!</a><br>
<a href="listStudents">Student Page</a><br>
<a href="listPerson">People Page</a><br>

</body>
</html>

<br>
<br>

</body>
</html>



<!--{message}
<form action="processform" method="post">
    First Name: <input type=" text" name =FName>
    Last Name: <input type=" text" name =LName>
    Age: <input type="number" name ="Age">

    <input type="submit" value="submit">


</form>

</body>
</html>
//Staff p2 = new Staff("Robert Redford", "123 Sundance Trail", "Grand Circus", 8453.22);--!>