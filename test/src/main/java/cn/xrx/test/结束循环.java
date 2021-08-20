package cn.xrx.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class 结束循环 {
    /**
     * #### 33.break ,continue ,return 的区别及作用
     *
     * break 跳出总上一层循环，不再执行循环(结束当前的循环体)
     *
     * continue 跳出本次循环，继续执行下次循环(结束正在执行的循环 进入下一个循环条件)
     *
     * return 程序返回，不再执行下面的代码(结束当前的方法 直接返回)
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3) {
                    continue;
                }
                System.out.print(j);

            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==3) {
                    break;
                }
                System.out.print(j);

            }
            System.out.println();
        }
    }
    Map<Integer, String> map = new HashMap<>();
    Map<String,String> map1 = new ConcurrentHashMap<>();
//    Collection
}

