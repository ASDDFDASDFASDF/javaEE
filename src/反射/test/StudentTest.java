package 反射.test;

import 反射.dto.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 通过反射动态给对象赋值
 */
public class StudentTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {

//        String str = "反射.dto.Student";
//        Class<?> clazz = Class.forName(str);
//        Object o = clazz.newInstance();
//
//        Method method = clazz.getDeclaredMethod("setName", String.class);
//        method.setAccessible(true);
//        method.invoke(o,"小王");

        Student student = new Student();
        Class<? extends Student> clazz = student.getClass();
        Method method = clazz.getDeclaredMethod("setName", String.class);
        method.invoke(student,"小王");

        System.out.println(student.getName());



    }
}
