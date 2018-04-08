package servlet;

import bitcoin.User;
import bitcoin.Worker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jackryannn on 18/3/29.
 */
@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fid = request.getParameter("fid");
        int flag = Integer.parseInt(request.getParameter("flag"));
        if(flag ==0){
            new User(fid);
        }else{
            new Worker(fid);
        }
        request.getRequestDispatcher("/panel.jsp?id=" + fid).forward(request, response);

    }
}
