<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 20.10.2022
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
String pageBody="/WEB-INF/"+request.getAttribute("pageBody");
String home=request.getContextPath();

%>

<html>
<head>
    <meta charset="UTF-8"/>
    <title>JSP basics</title>
    <link rel="stylesheet" href="<%=home%>/css/style.css">

</head>
<body>
<jsp:include page="/WEB-INF/authfragment.jsp"/>
<jsp:include page="<%=pageBody%>"/>
</body>
</html>
