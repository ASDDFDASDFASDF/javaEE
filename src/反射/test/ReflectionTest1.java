package 反射.test;

import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射创建无参构造对象
 */
public class ReflectionTest1 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String str = "反射.dto.Dog";

        Class<?> clazz = Class.forName(str);

        Object o = clazz.newInstance();//直接实例化对象
        System.out.println(o);

        Object o1 = clazz.getConstructor().newInstance();//通过无参构造实例化对象
        System.out.println(o1);

    }
}
