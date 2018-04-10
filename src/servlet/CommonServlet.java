package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jackryannn on 18/3/15.
 */
public class CommonServlet extends javax.servlet.http.HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        String s = request.getParameter("fid");
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        // 实际的逻辑是在这里
            PrintWriter writer = response.getWriter();
            writer.println("共识机制开关（默认开启）");
            writer.println("<br>\n" +
                    "<button id=\"1\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid=" + s + "&flag=2')\">开启</button>\n" +
                    "<button id=\"0\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid=" + s + "&flag=3')\">关闭</button>");
    }

}
