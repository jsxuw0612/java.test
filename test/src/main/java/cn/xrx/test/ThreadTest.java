package cn.xrx.test;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/6/17 12:12
 */
public class ThreadTest {
    public static void main(String[] args) {

        /**
         * 继承Thread类
         */
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName() + "main()方法执行结束");

        /**
         * 实现Runnable接口
         */
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        System.out.println(Thread.currentThread().getName() + "main()方法执行结束");


    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()方法正在执行...");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " run()方法正在执行...");
    }
}

