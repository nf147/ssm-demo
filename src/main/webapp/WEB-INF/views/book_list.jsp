<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
</head>
<body>

所有书籍:

<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>书名</th>
        <th>库存</th>
        <th>其他</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.bookid}</td>
            <td>${book.name}</td>
            <td>${book.cnt}</td>
            <td></td>
        </tr>
    </c:forEach>
    </tbody>

</table>

</body>
</html>
