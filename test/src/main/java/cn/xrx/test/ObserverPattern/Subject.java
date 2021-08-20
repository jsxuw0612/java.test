package cn.xrx.test.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:46
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

}
