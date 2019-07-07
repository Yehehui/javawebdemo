package cn.mju.edu.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/test")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        if(name.equals("yyh")){
            req.setAttribute("ErrorMsg","输入错误");
            req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req,resp);
            return;
        }else {
            req.getRequestDispatcher("/WEB-INF/jsp/Users.jsp").forward(req,resp);
            return;
        }
    }
}
