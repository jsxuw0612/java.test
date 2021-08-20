package cn.xrx.test.ObserverPattern;

import org.springframework.validation.ObjectError;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 15:04
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
