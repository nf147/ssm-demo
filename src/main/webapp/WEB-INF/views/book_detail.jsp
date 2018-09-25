<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
</head>
<body>

我是书籍详情:
<br>

<%=
    request.getAttribute("book")
%>


</body>
</html>
