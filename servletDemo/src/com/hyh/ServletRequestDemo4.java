package com.hyh;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求转发
 * 特点：
 * 浏览器地址栏不变
 * 域对象中的数据不丢失
 * 负责转发的servlet转发前后的响应正文会丢失
 * 由转发的目的地来响应
 */
@WebServlet("/servletDemo4")
public class ServletRequestDemo4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("address", "张村");
        //获取请求转发描述器
        RequestDispatcher rd = req.getRequestDispatcher("/servletDemo5");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
