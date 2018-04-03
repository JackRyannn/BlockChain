<%--
  Created by IntelliJ IDEA.
  User: jackryannn
  Date: 18/3/29
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<%out.println("当前账户为："+request.getParameter("id")); %>
<button type="button" onclick="javascript:window.open('transfer.jsp?fid='+<%=request.getParameter("id")%>)">进行交易</button>
<button type="button" onclick="javascript:window.open('showServlet')">状态查询</button>
<button type="button" onclick="javascript:window.open('blockServlet')">区块链查询</button>
</body>
</html>
