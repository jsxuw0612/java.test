package cn.xrx.test.cglib;

import org.springframework.cglib.proxy.Enhancer;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:30
 */
public class CglibTest {

    public static void main(String[] args) {
        System.out.println("******************");
        Target target = new Target();
        CglibTest cglibTest = new CglibTest();
        Target proxyTarget = (Target) cglibTest.creatProxy(Target.class);
        String result = proxyTarget.execute();
        System.out.println(result);
    }

    private Object creatProxy(Class<?> targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new MyMethodInterceptor());
        return enhancer.create();
    }
}
