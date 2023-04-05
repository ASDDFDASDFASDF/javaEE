package 算法;

import java.util.Arrays;

/**
 * 递归算法
 */
public class TestRecursionl {
    public static void main(String[] args) {
        //不适用递归 计算  1*2*3*4...*n
        long result = 1;
        long n = 10;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);

        //使用递归
        /**
         * 规律总结
         * n = n*(n-1)
         * n-1 = n-1*(n-2)
         * n-2 = n-2*(n-3)
         *
         * 3 = 3*(3-1)
         * 2 = 2*(2-1)
         */

        int a = 10;
        System.out.println(getValue(a));

        /**
         * 斐波那契数列
         * 1，1，2，3，5，8，13，21。。。
         *
         * 规律
         * fn = (fn-1) + (fn-2)
         */
        int m = 7;
        System.out.println(getFeibo(m));

        /**
         * 选择排序
         * 30，25，40，15，100，65，20
         */

        int arr[] = {30, 25, 40, 15, 100, 65, 20};

        ArraySort(arr);


    }

    private static void ArraySort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static int getFeibo(int m) {
        int result = 1;
        if (m > 2) {
            result = getFeibo(m - 1) + getFeibo(m - 2);
        } else {
            return result;
        }
        return result;
    }

    private static long getValue(int a) {
        long result = 1;
        if (a > 1) {
            result = a * getValue(a - 1);
        } else {
            return 1;
        }
        return result;
    }

}
