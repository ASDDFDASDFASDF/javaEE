package 数据结构;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add(1);


    }
}

class TestList<T> {
    private Object[] obj;
    private int size = 0;


    public TestList(int init) {
        if (null == obj)
            obj = new Object[init];
    }

    public void add(T t) {
        if (0 == size)
            obj[size] = t;

        ++size;
    }

    public void delete() {
    }

    public void size() {
    }

}