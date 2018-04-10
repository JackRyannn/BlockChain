<%--
  Created by IntelliJ IDEA.
  User: jackryannn
  Date: 18/3/29
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="rsa.RSAUtils" %>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title></title>
</head>
<body>
<!--当前账户：<%=request.getParameter("fid")%><br>-->
<!--<input type="hidden" value=<%=request.getParameter("fid")%> name="fid" />-->
参数(512倍数): <input type="text" id="parameter" value="512"/><br>
<button onclick="javascript:window.open('rsaServlet?fid='+'<%=request.getParameter("fid")%>'+'&parameter='+document.getElementById('parameter').value)">生成key</button><br>
公钥: <input type="text" id="key1" value="<%=request.getParameter("key1")%>"/><br>
私钥: <input type="text" id="key2" value="<%=request.getParameter("key2")%>"/><br>
文字: <input type="text" id="txt" /><br>
<button>加密</button><br>
加密文字: <input type="text" id="txt1" value="Hello World"></input><br>
<button>解密</button><br>
解密文字: <input type="text" id="txt2" ></input><br>
</form>
</body>
</html>

</script>