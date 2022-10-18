<%@ page contentType="text/html;charset=UTF-8" %>
<%
String userInput=(String)request.getAttribute("userInput");
%>
<html>
<head>



</head>

<body>
<h1>Servlet Api</h1>

<form method="post">
    Введите троку: <label><input name="userInput"/></label>
    <input type="submit" value="Отправить"/>

</form>
<p>
    <%if(userInput!=null)
{
    %>ранее было введен<b><%=userInput%></b>
<%}%>
</p>
</body>

</html>