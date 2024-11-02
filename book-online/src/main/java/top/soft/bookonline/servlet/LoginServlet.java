package top.soft.bookonline.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import top.soft.bookonline.entity.User;
import top.soft.bookonline.service.UserService;
import top.soft.bookonline.service.impl.UserServiceImpl;

import java.io.IOException;

/**
 * @description: TODO
 * @author admin
 * @date 2024/10/26 15:34
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserService userService ;

    @Override
    public void init(ServletConfig config) throws ServletException {
       userService = new UserServiceImpl();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取表单数据
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        //调用登录功能
        User user = userService.signIn(account, password);
        if (user != null) {
            //登录成功，将用户信息存入session
            HttpSession session =req.getSession();
            session.setAttribute("user", user);
            //重定向到首页
            resp.sendRedirect("/index");
        }else {
            //登录失败，跳转回登录页面
            resp.setContentType("text/html;charset=utf-8");
            resp.setCharacterEncoding("utf-8");
            resp.getWriter().write("<script>alert('登录失败,账号或密码错误');location.href='/';</script>");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doPost(req, resp);
    }
}
