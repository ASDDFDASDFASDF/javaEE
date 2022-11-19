package 反射.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * 使用反射突破泛型的限制
 */
public class TestGeneric {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<>();

        Class<? extends List> clazz = list.getClass();
        Method add = clazz.getMethod("add", Object.class);
        add.invoke(list, true);
        add.invoke(list, "123");
        System.out.println(list.toString());


    }
}
