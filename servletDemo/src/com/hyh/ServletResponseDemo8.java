package com.hyh;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 响应图片
 */
@WebServlet("/responseDemo8")
public class ServletResponseDemo8 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\照片\\微信图片_20180129205906.jpg"));
        ServletOutputStream outputStream = resp.getOutputStream();
        byte[] bytes = new byte[1024*1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1){
            outputStream.write(bytes,0, len);
        }
        bis.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
