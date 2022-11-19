package 反射.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射调用有参构造实例化对象
 * 只能new 共有构造器
 */
public class ReflectionTest2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String str = "反射.dto.Dog";
        Class<?> clazz = Class.forName(str);

//        Constructor<?> constructor = clazz.getConstructor(String.class, int.class, String.class);
//        Object o1 = constructor.newInstance("二哈", 21, "哈士奇");
//        System.out.println(o1);

        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class, String.class);
        declaredConstructor.setAccessible(true);//突破私有限制，但是这样不好
        Object o = declaredConstructor.newInstance("二哈", 21, "哈士奇");
        System.out.println(o);


    }
}
