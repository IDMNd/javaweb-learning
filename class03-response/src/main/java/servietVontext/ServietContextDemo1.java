package servietVontext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * @description: TODO
 * @author admin
 * @date 2024/9/28 16:36
 */
@WebServlet("/ServietContextDemo1")
public class ServietContextDemo1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //通过requestto获取ServletContext对象
        ServletContext context = req.getServletContext();
        ServletContext context1 = this.getServletContext();


        System.out.println(context.equals(context1));



    }
}