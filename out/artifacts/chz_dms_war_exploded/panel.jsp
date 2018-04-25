<%--
  Created by IntelliJ IDEA.
  User: jackryannn
  Date: 18/3/29
  Time: 14:47
  To change tris template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
  <style>
    table {
      width:100%;
      margin:15px 0;
      border:0;
      padding: 70px 0;
      border: 3px solid green;
      text-align: center;
    }
  </style>
</head>
<body>
<table>
    <tr><td><%out.println("当前账户为："+request.getParameter("id")); %></br>
    </td></tr>
  <tr><td><button type="button" onclick="javascript:window.open('transfer.jsp?fid='+'<%=request.getParameter("id")%>')">进行交易</button></br>
  </td></tr>
  <tr><td>
    <button type="button" onclick="javascript:window.open('showServlet')">状态查询</button></br>
  </td></tr>
  <tr><td>
    <button type="button" onclick="javascript:window.open('blockServlet')">区块链查询</button></br>
  </td></tr>
  <tr><td>
    <button type="button" onclick="javascript:window.open('commonServlet?fid='+'<%=request.getParameter("id")%>')">共识机制开关</button></br>
  </td></tr>
  <tr><td>
<button type="button" onclick="javascript:window.open('rsa.jsp?fid='+'<%=request.getParameter("id")%>')">非对称加密算法</button></br>
  </td></tr>
</table>
</body>
</html>
