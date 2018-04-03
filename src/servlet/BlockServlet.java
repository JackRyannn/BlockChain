package servlet;

import bitcoin.Block;

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
@WebServlet(name = "BlockServlet")
public class BlockServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        // 实际的逻辑是在这里
        PrintWriter out = response.getWriter();
        out.println("<h2>"+ Block.print()+ "</h2>");
    }
}
