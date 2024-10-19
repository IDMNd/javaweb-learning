package top.soft.class04coookiesession.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/cookieDemo03")
public class CookieDemo03 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException , ServletException
    {
        String value="张三";
        Cookie cookie=new Cookie("ChineseName", URLEncoder.encode(value, StandardCharsets.UTF_8));
        resp.addCookie(cookie);
    }
}
/**
 * @description: TODO
 * @author admin
 * @date 2024/10/19 14:17
 * @version 1.0
 */