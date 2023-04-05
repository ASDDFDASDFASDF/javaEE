package 泛型;

/**
 * 泛型类
 *
 * @param <T>
 */
public class GenericDemo<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    //泛型方法
    public <T> void getName(T t) {
        System.out.print(t);
    }
}
