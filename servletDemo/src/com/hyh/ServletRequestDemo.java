package com.hyh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * servletRequest 对象
 */
public class ServletRequestDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取虚拟目录名称
        String path = req.getContextPath();
        System.out.println(path);

        //获取servlet映射路径
        String servletPath = req.getServletPath();
        System.out.println(servletPath);

        //获取访问者IP
        String remoteAddr = req.getRemoteAddr();
        System.out.println(remoteAddr);

        //获取请求的消息数据
        String queryString = req.getQueryString();
        System.out.println(queryString);

        //获取统一资源标识符
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);

        //获取统一资源定位符
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
