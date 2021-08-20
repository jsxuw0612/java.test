package cn.xrx.test.ObserverPattern;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:55
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
