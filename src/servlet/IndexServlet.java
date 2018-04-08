package servlet;
import models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import bitcoin.*;

/**
 * Created by jackryannn on 18/3/15.
 */
public class IndexServlet extends javax.servlet.http.HttpServlet {

    private String message;

//    ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//    User user = (User)context.getBean("user");

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        String s = request.getParameter("account");
        // 设置响应内容类型
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        // 实际的逻辑是在这里
        if(bitcoin.User.getById(s)==null){
            PrintWriter writer = response.getWriter();
            writer.println("当前用户为新用户，将自动注册，是否成为矿工");
            writer.println("<br>\n" +
                    "<button id=\"1\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid="+s+"&flag=1')\">是</button>\n" +
                    "<button id=\"0\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid="+s+"&flag=0')\">否</button>");
        }else {
            request.getRequestDispatcher("/panel.jsp?id=" + s).forward(request, response);
        }
    }

}
