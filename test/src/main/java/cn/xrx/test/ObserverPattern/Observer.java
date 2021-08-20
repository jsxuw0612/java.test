package cn.xrx.test.ObserverPattern;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:53
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();

}
