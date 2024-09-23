package top.soft.class02request;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo04")
public class requestDemo04 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 获取参数名
        String username = req.getParameter("username");
        System.out.println("username:" + username);
        // 2. 获取参数值
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println("hobby:" + hobby);
        }
        // 3. 获取所有参数名称
        System.out.println("________________________________");
        System.out.println("所有的参数名称：");
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String name = parameterNames.nextElement();
            System.out.print("参数名" + name + "\t");
            String value = req.getParameter(name);
            System.out.println("参数值" + value);
        }
        //获取所有参数的Map集合
        System.out.println("________________________________");
        System.out.println("所有的参数的Map集合：");
        Map<String, String[]> parameterMap = req.getParameterMap();
        Set<String> keySet = parameterMap.keySet();
        for (String name : keySet) {
            String[] values = parameterMap.get(name);
            System.out.print("参数名" + name + "\t");
            for (String value : values) {
                System.out.print("参数值" + value + "\t");
            }
        }
    }
}