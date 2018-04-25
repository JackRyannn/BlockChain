package servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
            String r = "<head>\n" +
                    "    <title></title>\n" +
                    "  <style>\n" +
                    "    table {\n" +
                    "      width:60%;\n" +
                    "      margin:auto;\n" +
                    "      border:0;\n" +
                    "      padding: 70px 0;\n" +
                    "      border: 3px solid green;\n" +
                    "      text-align: center;\n" +
                    "    }\n" +
                    "  </style>\n" +
                    "</head>";
            r += "<table><tr><td colspan=\"2\">当前用户为新用户，将自动注册，是否成为矿工<br></td></tr>";
            r += "<tr><td><button style=\"width=100px;\"  id=\"1\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid="+s+"&flag=1')\">________是________</button></td>\n" +
                    "<td><button style=\"width=100px;\"  id=\"0\" type=\"button\" onclick=\"javascript:window.open('registerServlet?fid="+s+"&flag=0')\">________否________</button></td></tr></table>";
            writer.print(r);
        }else {
            request.getRequestDispatcher("/panel.jsp?id=" + s).forward(request, response);
        }
    }

}
