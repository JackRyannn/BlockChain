<%--
  Created by IntelliJ IDEA.
  User: jackryannn
  Date: 18/3/29
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
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
<form class="center" action="transferServlet" method="get">
  当前账户：<%=request.getParameter("fid")%><br>
  <input type="hidden" value=<%=request.getParameter("fid")%> name="fid" /><br>
  收款账户: <input type="text" name="tid" /><br>
  收款金额: <input type="text" name="money" /><br><br>
  <input type="submit" value="Submit" />
</form>
</body>
</html>
