package cn.xrx.test.dynamic;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:17
 */
public class TargetImpl implements Target {
    @Override
    public String execute() {
        System.out.println("TargetImpl execute！");
        return "execute";
    }
}
