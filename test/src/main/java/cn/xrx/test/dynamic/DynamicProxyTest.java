package cn.xrx.test.dynamic;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:20
 */
public class DynamicProxyTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        DynamicProxyHandler dynamicProxyHandler = new DynamicProxyHandler(target);
        Target proxySubject  = (Target) Proxy.newProxyInstance(TargetImpl.class.getClassLoader(), TargetImpl.class.getInterfaces(), dynamicProxyHandler);
        String result = proxySubject.execute();
        System.out.println(result);

    }
}
