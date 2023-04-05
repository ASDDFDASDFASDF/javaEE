package 反射.test;


import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * 使用反射获取泛型信息
 */
public class ReflectionTest3 {
    public void methed3(Map<String, Object> map, List<String> String) {

    }

    public static void main(String[] args) throws NoSuchMethodException {

        Class<ReflectionTest3> clazz = ReflectionTest3.class;

        Method method = clazz.getMethod("methed3", Map.class, List.class);

        //获取参数化类型
        Type[] type = method.getGenericParameterTypes();

        for (Type type1 : type) {
            System.out.println(type1);
        }

    }

}
