package practise;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @description: TODO
 * @author admin
 *
 *
 *
 *
 * */
@WebServlet("/VerityCode")
public class VerityCode extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    int width = 160;
    int height = 50;
    BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

    Graphics g = image.getGraphics();
    g.setColor(Color.WHITE);
    g.fillRect(0, 0, width, height);
    String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    Random r = new Random();
    for (int i = 0; i < 5; i++) {
        int x = r.nextInt(str.length());

        char ch = str.charAt(x);
        Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        g.setColor(c);
        Font f = new Font("宋体", Font.BOLD, 20);
        g.setFont(f);
        g.drawString(String.valueOf(ch), width/5*i, height / 2);
       }
    for (int i = 0; i < 5; i++) {
        int x1 = r.nextInt(width);
        int y1 = r.nextInt(height);
        int x2 = r.nextInt(width);
        int y2 = r.nextInt(height);
        Color c1 = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
        g.setColor(c1);
        g.drawLine(x1, y1, x2, y2);

        }//生成随机角标
        Random random = new Random();
        for (int i = 0; i <= 5; i++) {
            int index = random.nextInt(str.length());
            char c = str.charAt(index);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            g.setColor(color);
            Font font = new Font("Dialog", Font.BOLD, 20);
            g.drawString(String.valueOf(c), width/5*i, height/2);
        }
//        设置噪点
        Random random2 = new Random();
        for (int i = 0; i <= 35; i++) {
            int x = random2.nextInt(width);
            int y = random2.nextInt(height);
            g.setColor(Color.black);
            g.drawRect(x, y, 5,5 );
        }
//        设置干扰线
        for (int i = 0; i < 10; i++) {
            int x1 = random.nextInt(width);
            int x2 = random.nextInt(width);
            int y1 = random.nextInt(height);
            int y2 = random.nextInt(height);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            g.setColor(color.BLUE);
            g.drawLine(x1, y1, x2, y2);
        }

       ImageIO.write(image, "jpg", response.getOutputStream());
    }

}

