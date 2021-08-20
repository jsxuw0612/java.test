package cn.xrx.test.proxy;

import java.sql.PreparedStatement;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:09
 */
public class Proxy implements Target {

    private Target target;

    public Proxy(Target target) {
        this.target = target;
    }

    @Override
    public String execute() {
        System.out.println("preProcess");
        String result = this.target.execute();
        System.out.println("postProcess");
        return result;
    }
}
