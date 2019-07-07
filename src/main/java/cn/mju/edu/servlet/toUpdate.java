package cn.mju.edu.servlet;

import cn.mju.edu.javabean.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("update")
public class toUpdate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> users= (List<User>) getServletContext().getAttribute("users");
        for(User user:users){
            if(user.getId()==Integer.parseInt(req.getParameter("id"))){
                getServletContext().setAttribute("user",user);
            }
        }
        req.getRequestDispatcher("./WEB-INF/jsp/update.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
