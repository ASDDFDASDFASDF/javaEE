package 数据结构;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Predicate;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer t1, Integer t2) {
                return t2 - t1;
            }
        });

        //lamda 表达式
        TreeSet<Integer> treeSet1 = new TreeSet<>((t1, t2) -> {
            return t2 - t1;
        });
        Collections.addAll(treeSet, 23, 31, 23, 43, 12, 1);
        System.out.println(treeSet);

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer == 31)
                    return true;
                return false;
            }
        };
        treeSet.removeIf(predicate);


        treeSet.removeIf((integer -> {
            if (integer == 12)
                return true;
            return false;
        }));
        System.out.println(treeSet);


    }
}
