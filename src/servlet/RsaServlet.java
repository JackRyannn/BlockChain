package servlet;

import rsa.RSAUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by jackryannn on 18/3/29.
 */
@WebServlet(name = "RsaServlet")
public class RsaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        // 实际的逻辑是在这里
        String fid = request.getParameter("fid");
        String p = request.getParameter("parameter");
        Map<String, String> keyMap = RSAUtils.createKeys(Integer.valueOf(p));
        String  publicKey = keyMap.get("publicKey");
        String  privateKey = keyMap.get("privateKey");
        request.getRequestDispatcher("/rsa.jsp?fid=" + fid+"&key1="+publicKey+"&key2="+privateKey).forward(request, response);
    }
}
