package top.soft.class03response;

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
 * @date 2024/9/28 14:55
 */
@WebServlet("/res")
public class responseTypeDemo1 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String type = req.getParameter("type");
        switch (type) {
            case "img":
                getImage(req, resp);
                break;
            case"txt":
                getText(req, resp);
                break;
            case"pdf":
                getPdf(req,resp);
                break;
        default:
             break;
        }
    }



    private void getImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("image/jpg");
        String realPath = request.getServletContext().getRealPath("/images/image.jpg");
        File file = new File(realPath);
        InputStream in= new FileInputStream(file);
        int read =0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1){
            out.write(read);
        }
        out.flush();
        out.close();
    }
    private void getText(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/txt;charset=UTF-8");//设置响应头信息
        String realPath3 = req.getServletContext().getRealPath("/text/cast.txt");//获取文件的真实路径
        File file3 = new File(realPath3);
        InputStream in3 = new FileInputStream(file3);

        int read = 0;
        ServletOutputStream out = resp.getOutputStream();
        while ((read = in3.read()) != -1) {
            out.write(read);
        }
        out.flush();
        out.close();
    }
    private void getPdf(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("application/pdf");
        String realPath = request.getServletContext().getRealPath("");
        File file = new File(realPath+"/pdf/iDME学生账号使用指导.pdf");
        InputStream in= new FileInputStream(file);
        int read =0;
        ServletOutputStream out = response.getOutputStream();
        while ((read = in.read()) != -1){
            out.write(read);
        }
        out.flush();
        out.close();
    }
}
