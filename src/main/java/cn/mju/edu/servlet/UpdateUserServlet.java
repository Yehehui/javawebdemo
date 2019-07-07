package cn.mju.edu.servlet;

import cn.mju.edu.javabean.User;
import cn.mju.edu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("updateUser")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService service=new UserService();
        User user=new User();
        user.setId(Integer.parseInt(req.getParameter("id")));
        user.setLoginname(req.getParameter("loginname"));
        user.setPassword(req.getParameter("password"));
        user.setName(req.getParameter("name"));
        user.setSex(req.getParameter("sex"));
        user.setTel(req.getParameter("tel"));
        user.setEmail(req.getParameter("email"));
        List<User> users=service.updateUser(user);
        getServletContext().setAttribute("users",users);
        req.getRequestDispatcher("./WEB-INF/jsp/Users.jsp").forward(req,resp);
    }
}
