<%@ page contentType="text/html;charset=UTF-8" %>
<%
    String email=(String)request.getAttribute("email");
    String password1=(String)request.getAttribute("password1");
    String password2=(String)request.getAttribute("password2");%>

<%


%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<body>

<form method="post">
    <div class="container">
        <h1>Register</h1>
        <p>Please fill in this form to create an account.</p>
        <hr>


        <input type="text" placeholder="Enter Email" name="email" required>


        <input type="password" placeholder="Enter Password" name="password1" required>


        <input type="password" placeholder="Repeat Password" name="password2" required>
        <hr>
        <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

        <button type="submit">send

        </button>

        <p>
            <%if(email!=null&&password1==password2)
            {
            %><b><%=email%></b>
            %><b><%=password1%></b>
            %><b><%="регестрация прошла!"%></b>

            <%}%>
        </p>
    </div>


    <div class="container signin">
        <p>Already have an account? <a href="#">Sign in</a>.</p>
    </div>
</form>

</body>
</html>
