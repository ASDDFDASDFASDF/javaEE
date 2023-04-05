package com.hyh;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 请求包含
 * 特点：
 * 浏览器地址栏不变
 * 域对象中数据不丢失
 * 被包含的servlet响应头会对丢失
 */
@WebServlet("/servletDemo6")
public class ServletRequestDemo6 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求描述器
        System.out.println("servletDemo6执行了...");
        RequestDispatcher rd = req.getRequestDispatcher("/servletDemo7");
        rd.include(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
