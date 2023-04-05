package com.hyh;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向
 * 特点
 * 浏览器会发生改变，相当于是两次请求，请求域中的对象数据不能共享，可以重定向到其他服务器
 */
@WebServlet("/responseDemo9")
public class ServletResponseDemo9 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", "测试重定向");
        //重定向需要获取虚拟路径和资源定位符
        resp.sendRedirect(req.getContextPath() + "/responseDemo10");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
