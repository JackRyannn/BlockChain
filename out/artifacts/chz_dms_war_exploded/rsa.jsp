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
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
  <title></title>
</head>
<body>
<!--当前账户：<%=request.getParameter("fid")%><br>-->
<!--<input type="hidden" value=<%=request.getParameter("fid")%> name="fid" />-->
参数(512倍数): <input type="text" name="parameter" value="512"/><br>
<button>生成key</button><br>
公钥: <input  name="key1" /><br>
私钥: <input type="text" name="key2" ></input><br>
文字: <input type="text" name="txt" ></input><br>
<button>加密</button><br>
加密文字: <input type="text" name="txt1" ></input><br>
<button>解密</button><br>
解密文字: <input type="text" name="txt2" ></input><br>
</form>
</body>
</html>
