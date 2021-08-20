package cn.xrx.test;

import java.io.IOException;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/7/4 11:13
 */
public class ExceptionTypeTest {
    public void doSomething() throws IOException {
        System.out.println();
    }
    public static void main() throws IOException {
        ExceptionTypeTest ett = new ExceptionTypeTest();
        ett.doSomething();
    }
}
