package top.soft.class03response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*** @description: TODO
 * @author 转发和不定项
 * @date 2024/9/28 14:26
 */
@WebServlet("/responseDemo2")
public class responseDemo2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     //  req.getRequestDispatcher("/responseDemo1?username=zhangsan").forward(req,resp);
     //  resp.sendRedirect("/responseDemo1?username=zhangsan");
        resp.sendRedirect("https://www.baidu.com/");
    }
}