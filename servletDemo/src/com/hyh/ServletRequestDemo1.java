package com.hyh;

import com.hyh.dto.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 反射封装参数对象
 */
public class ServletRequestDemo1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Map<String, String[]> parameterMap = req.getParameterMap();
        Student student = new Student();
        for(String key: parameterMap.keySet()){
            String[] value = parameterMap.get(key);

            //获取属性描述器
            try {
                //获取student对象的属性信息
                PropertyDescriptor pd = new PropertyDescriptor(key, student.getClass());
                //获取set方法。
                Method writeMethod = pd.getWriteMethod();
                //通过set方法给对象赋值
                if (value.length>1) {
                    writeMethod.invoke(student, (Object)value);
                }else {
                    writeMethod.invoke(student, value);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(student);
        }
    }
}
