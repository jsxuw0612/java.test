package cn.xrx.test;

import java.util.*;

/**
 * 懒汉式 线程安全
 */
class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1 () {}

    public static synchronized Singleton1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton1();
        }
        return singleton1;
    }

}

/**
 * 饿汉式 线程安全
 */
class Singleton2 {
    private static Singleton2 singleton2 = new Singleton2();

    private Singleton2() {}

    public static Singleton2 getInstance() {
        return singleton2;
    }
}

/**
 * 双重验证
 */
class Singleton3 {
    private static volatile Singleton3 singleton3;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (singleton3 == null) {
            synchronized (Singleton3.class){
                if (singleton3 == null) {
                    singleton3 = new Singleton3();
                }
            }
        }
        return singleton3;
    }
}



public class test2 {
    public static void main(String[] args) {

//        int len = 1000;
//        int sum = 0;
//        for (int i = 0; i < len+1; i++) {
//            sum+=i;
//        }
//        Object o = new Object();
//        System.out.println("sum = " + sum);
        String a = "123";
        String b = "123";
        float f = 3.4f;

        String c = new String("123");
        boolean d = a.equals(b);
        System.out.println(d);
        Map<String,String> m = new HashMap<String,String>();
        List<Integer> list = new ArrayList<>();
        for (String value : m.values()) {
            m.containsKey(value);
        }
        for (Map.Entry<String, String> ssE : m.entrySet()) {
            String value = ssE.getValue();
        }
        List<String > l = new ArrayList<>();
        l.toArray(new String[l.size()]);
//        System.out.println(a==b);
//        System.out.println(a.equals(c));
//        System.out.println(a==c);

        // ----------------------------------
        int[] flowerbed = new int[10];
        int left = 0, right =  flowerbed.length - 1;
        for (; left <= right; left++, right--) {

        }
        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        for (Integer integer : set) {

        }
//        list1.remove()
        String s = "abcdefg";
        String substring = s.substring(1, 3);
        System.out.println(substring);

        Deque<Integer> stack = new ArrayDeque<>();
        stack.pop();
        for (Integer integer : stack) {

        }
        int[] arr = {3,4,5,1,2};
        Arrays.sort(arr);
        String s1 = new StringBuilder(s).reverse().toString();
//        int[] b = {2,51,12,95,42,52,76,77,23,81,71,41,2,23,43,4,64,22,71,96,1,87,51,91,67,16,58,11,44,38,63,14,4,69,88,49,92,91,9,15,17,74,21,91,24,78,62,50,82,26,53,18,25,14,94,79,44,11,36,38,44,53,9,34,58,6,50,82,81,50,36,1,6,61,9,47,33,47,84,41,57,48,73,18};


    }
}

class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int beginColumn = 0;
        int coloum = matrix[0].length;
        int beginRow = 0;
        int row = matrix.length;

        while (beginColumn  < coloum && beginRow < row) {
            for (int i = beginColumn; i < coloum; i++) {
                list.add(matrix[i][beginRow]);
            }
            beginRow++;
            for (int i = beginRow; i < row; i++){
                list.add(matrix[coloum][i]);
            }
            coloum--;
            for (int i = coloum; i > beginColumn; i--) {
                list.add(matrix[i][row]);
            }
            row--;
            for (int i = row; i > beginRow; i--) {
                list.add(matrix[beginColumn][i]);
            }
            beginColumn++;
        }
        return list;
    }
}

/*class AA {
    private int aa(int a) throws IndexOutOfBoundsException{
        return 0;
    }
}
class BB extends AA {
    @Override
    private int aa(int a) throws Exception {


    }
}*/

