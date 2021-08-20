package cn.xrx.test;

/**
 * @author xrx
 * @create 2021/6/15 11:47
 */
public class LambadaDemo0 {

    public static void main(String[] args) {

        // 匿名内部类的形式开启一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("xrx");
            }
        }).start();

        //Lambada表达式创建匿名内部类开启一个线程
        new Thread(() -> System.out.println("-----------")).start();
    }
}
