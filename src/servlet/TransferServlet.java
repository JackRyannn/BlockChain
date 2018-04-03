package servlet;

import bitcoin.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jackryannn on 18/3/29.
 */
@WebServlet(name = "TransferServlet")
public class TransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        int fid = Integer.parseInt(request.getParameter("fid"));
        int tid = Integer.parseInt(request.getParameter("tid"));
        int delta = Integer.parseInt(request.getParameter("money"));
        User user = User.getById(fid);
        String ret = user.transfer(tid,delta);
        PrintWriter writer = response.getWriter();
        writer.println("<h1>"+ret+"</h1><br>");
        writer.println("<button type=\"button\" onclick=\"javascript:window.open('panel.jsp?id="+fid+"')\">返回</button>\n");
    }
}
