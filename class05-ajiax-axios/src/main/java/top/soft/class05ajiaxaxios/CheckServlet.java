package top.soft.class05ajiaxaxios;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @description: TODO
 * @author admin
 * @date 2024/11/9 14:27
 */

@WebServlet("/check")
public class CheckServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1、获取用户名
       String username= req.getParameter("username");
       boolean equals =!"admin".equals(username);
       resp.getWriter().write(String.valueOf(equals));
    }
}