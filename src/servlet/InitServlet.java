package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import bitcoin.Block;
import bitcoin.User;
import bitcoin.Worker;

/**
 * Created by jackryannn on 18/3/29.
 */
@WebServlet(name = "InitServlet")
public class InitServlet extends HttpServlet {
    private static Logger logger = Logger.getLogger(InitServlet.class.toString());

    @Override
    public void init() throws ServletException {
        super.init();
        Block initBlock = new Block();
        initBlock.setIndex(0);
        initBlock.setTimestamp(new SimpleDateFormat("yy-MM-dd hh:mm:ss").format(new Date()));
        initBlock.setInfo("该块为创世块，无交易信息");
        initBlock.setPrevHash("0");
        initBlock.setHash(initBlock.calculateHash());
        Block.arrayList.add(initBlock);
        User initUser = new User(1);
        User initUser2 = new User(2);
        Worker worker3 = new Worker(3);
        Worker worker4 = new Worker(4);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
