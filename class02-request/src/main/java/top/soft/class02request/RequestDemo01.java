package top.soft.class02request;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author zhangzhiwei
 * @date 2022/12/15 17:38
 * @description 获取request 行数据
 */
@WebServlet("/requestDemo01")
public class RequestDemo01 extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取请求方式
        System.out.println("请求方式：" + req.getMethod());
        // 获取Servlet路径
        System.out.println("Servlet路径：" + req.getServletPath());
        // 获取请求参数
        System.out.println("请求参数：" + req.getQueryString());
        // 获取协议及版本号
        System.out.println("协议及版本号：" + req.getProtocol());

        // 获取当前请求的URL
        System.out.println("当前请求的URL：" + req.getRequestURL());
        // 获取当前请求的URI
        System.out.println("当前请求的URI：" + req.getRequestURI());
        // 获取虚拟目录
        System.out.println("虚拟目录：" + req.getContextPath());

    }

}