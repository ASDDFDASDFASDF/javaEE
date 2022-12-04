package com.hyh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 */
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(this);
        System.out.println(req);
        String userName = req.getParameter("userName");
        try {
            Thread.sleep(3000);
            PrintWriter writer = resp.getWriter();
            writer.println(userName);
            writer.close();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void init() throws ServletException {
        System.out.println("对象创建成功");
    }

    @Override
    public void destroy() {
        System.out.println("对象销毁成功");
    }
}
