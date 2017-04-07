<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>

<html>
<head>
    <title>Spring MVC Hello World</title>
</head>

<body>
<h2>All Employees in System</h2>

<table border="1">
    <tr>
        <th>Employee Id</th>
        <th>First Name</th>
        <th>Last Name</th>
    </tr>
    <c:forEach items="${list}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.firstName}</td>
            <td>${employee.lastName}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>