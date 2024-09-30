package servietVontext;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: TODO
 * @author admin
 * @date 2024/9/28 16:42
 *
 * */
@WebServlet("/servietDemo2")
public class ServietContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取ServletContext对象
        ServletContext servletContext = req.getServletContext();
        resp.setContentType("text/html;charset=UTF-8");
        String filename = servletContext.getRealPath("/a.txt");
        System.out.println(filename);
        String filename2 = servletContext.getRealPath("/WEB-INF/b.txt");
        System.out.println(filename2);
        String filename3 = servletContext.getRealPath("/WEB-INF/classes/c.txt");
        System.out.println(filename3);
        File file = new File(filename3);
        InputStream in = new FileInputStream(file);
        int read = 0;
        ServletOutputStream out = resp.getOutputStream();
        while ((read = in.read()) != -1) {
            out.write(read);
        }
        in.close();
        out.flush();
        out.close();
    }
}