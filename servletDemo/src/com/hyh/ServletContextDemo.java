package com.hyh;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletContextDemo extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取ServletContext
        ServletContext context = getServletContext();

        //常用方法
        //获取全局参数配置
        String coding = context.getInitParameter("globalEnCoding");
        System.out.println(coding);

        //获取应用的虚拟目录
        String contextPath = context.getContextPath();
        System.out.println(contextPath);

        //根据虚拟目录获取绝对路径
        String realPath = context.getRealPath("/");
        System.out.println(realPath);

        //获取文件路径
        String b = context.getRealPath("/b.txt");
        System.out.println(b);

        String c = context.getRealPath("/WEB-INF/c.txt");
        System.out.println(c);

        String a = context.getRealPath("/WEB-INF/classes/a.txt");
        System.out.println(a);
    }
}
