package cn.xrx.test.proxy;

import java.util.Properties;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:12
 */
public class ProxyTest {

    public static void main(String[] args) {
        Target target = new TargetImpl();
        Proxy p = new Proxy(target);
        String result = p.execute();
        System.out.println(result);
    }

}
