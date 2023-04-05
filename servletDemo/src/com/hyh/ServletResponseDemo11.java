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
 * 重定向
 */
@WebServlet("/responseDemo11")
public class ServletResponseDemo11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取文件路径
        String realPath = getServletContext().getRealPath("/img/111.jpg");

        //获取输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(realPath));

        /**设置响应头
         *
         * application/octet-stream  消息头参数 应用的类型为字节流
         */
        resp.setHeader("Content-Type", "application/octet-stream");
        //设置响应头以下载方式打开附件
        /**
         * Content-Disposition: 处理形式
         * attachment;filename=111.jpg   以附件形式处理，指定下载文件
         */
        resp.setHeader("Content-Disposition", "attachment;filename=111.jpg");

        //获取输出流
        ServletOutputStream outputStream = resp.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = bis.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }

        //关闭流
        bis.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
