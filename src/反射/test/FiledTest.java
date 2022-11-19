package 反射.test;

import java.lang.reflect.Field;

/**
 * 使用反射操作属性
 * Dog dog = new Dog()
 * dog.type = "aa";
 * 不是用setter getter 方法
 */
public class FiledTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        //使用反射操作属性

        //获取类的完整路径字符串
        String str = "反射.dto.Dog";
        //得到类的对象
        Class<?> clazz = Class.forName(str);
        //使用反射创建对象
        Object o = clazz.newInstance();
        //使用反射得到属性
        Field field = clazz.getDeclaredField("type");
        //使用反射操作属性
        field.setAccessible(true);
        field.set(o,"哈士奇");//往对象中设置属性值，看着好像反过来了,  dog.type="哈士奇"

        Object o1 = field.get(o);//从对象中获取属性值，
        System.out.println(o1);


    }
}
