<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        form,input
        {
            /*border:1px solid green;*/
            margin:auto;
            width: 40%;

        }
        .center {
            padding: 70px 0;
            border: 3px solid green;
            text-align: center;
        }
    </style>
</head>
<body>
<form action="indexServlet" class="center" method="get" >
    输入账户: <input width="280px" type="text" name="account" /></br></br>
    <input width="300px" type="submit" value="登陆" />
</form>
</body>
</html>