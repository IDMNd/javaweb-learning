package top.soft.class03response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @description: TODO
 * @author admin
 * @date 2024/9/28 13:59
 */
@WebServlet("/responseDemo1")
public class ResponseDemo1  extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uesrname = req.getParameter("username");
        System.out.println("responseDemo1 被请求了");
        if(uesrname.equals("zhangsan")){
            resp.setStatus(200);
        }else{
            resp.setStatus(404);
        }

    }
}