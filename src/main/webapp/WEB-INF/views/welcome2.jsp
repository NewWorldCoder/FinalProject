<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"
           prefix="c"%>
<!DOCTYPE html>
<html>
<head>

    <title>Person Test</title>
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
        </tr>>
    </c:forEach>
</table>

<a href="welcome">Welcome!</a><br>
<a href="student">Student Page</a><br>
<a href="staff">Staff Page</a><br>

</body>
</html>


