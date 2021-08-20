package cn.xrx.test.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:28
 */
public class MyMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println(">>>>MethodInterceptor start...");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println(">>>>MethodInterceptor ending...");
        return "result";
    }
}
