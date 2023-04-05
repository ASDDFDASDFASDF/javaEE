package com.hyh;

import com.hyh.dto.Student;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * 使用工具类封装对象
 */

public class ServletRequestDemo2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = new Student();
        Map<String, String[]> map = req.getParameterMap();
        try {
            BeanUtils.populate(student, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(student);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
