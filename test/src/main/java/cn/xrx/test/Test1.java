package cn.xrx.test;

import java.util.*;

public class Test1 {

    public static void add(A a) {
        //a = new A();   ①
        // 当把①注解掉时，输出的结果是1，当①没有注解是是0，原因是 a =new A();构造了新的A对象就不是传递的那个对象了。
        a.i++;
    }

    public static void main(String args[]) {
        A a = new A();
        add(a);
        System.out.println(a.i );


        List<Integer> l1 = new ArrayList<Integer>();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String s = br.readLine();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String s = "111";
//        int aaa = Integer.parseInt(s);
//        System.out.println(aaa);

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print("i=" + i + " , " + "j=" + j);

                if(j==5){
//                    break ;
                    continue;
                }
            }
            System.out.println();
        }
    }

}


class A {
    int i = 0;
}

class test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        int i = 0;
        Map<Integer,String> m = new HashMap<Integer,String>();
        Set<Integer> l1 = new HashSet<Integer>();
    }
}
