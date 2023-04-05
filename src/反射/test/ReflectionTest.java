package 反射.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        String str = "反射.dto.Dog";

        Class<?> clazz = Class.forName(str);
        Object o = clazz.getConstructor().newInstance();


        //获取所有属性
        Field[] fields = clazz.getFields();//只能获取共有属性,包括父类的属性
        for (Field field : fields) {
            System.out.println(field);
        }

        Field[] fields1 = clazz.getDeclaredFields();//只能获取本类中的属性，私有的也可以
        for (Field field : fields1) {
            System.out.println(field);
        }

        Field type = clazz.getField("nickName");//只能获取共有属性的类型，包括父类中的
        System.out.println(type.getType());


        Field type1 = clazz.getDeclaredField("type");//只能获取本类中的属性，包括私有的
        System.out.println(type1.getType());

        //获取成员方法
        Method[] methods = clazz.getMethods();//获取共有方法,包括父类的
        for (Method method : methods) {
            System.out.println(method);
        }

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }

        //获取构造方法

        Constructor<?>[] constructors = clazz.getConstructors();


    }
}
