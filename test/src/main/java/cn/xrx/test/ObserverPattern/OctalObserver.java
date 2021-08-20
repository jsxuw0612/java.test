package cn.xrx.test.ObserverPattern;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 15:03
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
