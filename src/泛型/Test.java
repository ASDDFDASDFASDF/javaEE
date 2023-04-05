package 泛型;

public class Test {
    public static void main(String[] args) {
        /**
         * 泛型类  实现不同类型参数
         */
        GenericDemo<String> genericDemo = new GenericDemo<>();
        genericDemo.setT("小狗");
        System.out.print(genericDemo.getT());

        GenericDemo<Integer> demo = new GenericDemo<>();
        demo.setT(123);
        System.out.print(demo.getT());

        //泛型类
        GenericDemo gs = new GenericDemo();
        Student student = new Student();
        gs.getName(student);

        GenericDemo gs1 = new GenericDemo();
        Techer techer = new Techer();
        gs1.getName(techer);

        //泛型接口
        Generic generic = new GenericImpl();
        generic.show(new Techer());

    }
}
