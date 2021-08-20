package cn.xrx.test.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:18
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Target target;

    public DynamicProxyHandler(Target target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====== before ========");
        Object result = method.invoke(target, args);
        System.out.println("====== after =========");
        return result;
    }
}
