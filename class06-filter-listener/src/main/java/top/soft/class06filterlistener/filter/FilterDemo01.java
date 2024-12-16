package top.soft.class06filterlistener.filter;

import jakarta.servlet.*;

import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter( "/*")
public class FilterDemo01 implements Filter {
    @Override
    public void init(FilterConfig filterconfig) {
        System.out.println("初始化");
    }
    @Override
    public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain filterchain) throws ServletException, IOException {
        System.out.println("放行资源前执行");
        filterchain.doFilter(servletrequest, servletresponse);
        System.out.println("放行资源后执行");
    }

    @Override
    public void destroy() {
        System.out.println("销毁" );
    }


}