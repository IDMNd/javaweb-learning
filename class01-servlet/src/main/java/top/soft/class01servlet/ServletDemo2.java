package top.soft.class01servlet;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * @author liu wenbo
 * @deprecated Servlet
 * @date 2024-09-18
 */


public class ServletDemo2 implements Servlet{
    /**
     *
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("ServletDemo2 初始化");
    }
    /**
     * 执行Servlet 方法
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().write("servletdemo2 执行");
        System.out.println("servletDemo2 执行");

    }
    /**
     * 获取Servlet配置
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    /**
     * 获取servlet 信息
     *
     * @return
     */
    @Override
    public String getServletInfo() {
        return "";
    }

    /**
     * 执行销毁方法
     */
    @Override
    public void destroy() {
        System.out.println("销毁方法");
    }
}
