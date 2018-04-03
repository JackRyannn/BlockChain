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
    <title></title>
</head>
<body>
<form action="transferServlet" method="get">
  当前账户：<%=request.getParameter("fid")%><br>
  <input type="hidden" value=<%=request.getParameter("fid")%> name="fid" />
  收款账户: <input type="text" name="tid" /><br>
  收款金额: <input type="text" name="money" /><br>
  <input type="submit" value="Submit" />
</form>
</body>
</html>
