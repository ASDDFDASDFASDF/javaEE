package com.hyh;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * ServletConfig 对象是针对每一个Servlet的配置类
 * 生命周期和servlet是一样的
 */
public class ServletConfigDemo extends HttpServlet {

    private ServletConfig config;

    //通过初始化方法赋值
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> init = config.getInitParameterNames();
        while (init.hasMoreElements()){
            System.out.println(init.nextElement());

            String key = init.nextElement();
            String val = config.getInitParameter(key);
            System.out.println("key:"+key+"val:"+val);

        }
        //获取servlet名称
        System.out.println(config.getServletName());

        //获取ServletContext
        ServletContext servletContext = config.getServletContext();
        System.out.println(servletContext);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
