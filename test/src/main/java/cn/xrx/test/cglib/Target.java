package cn.xrx.test.cglib;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:26
 */
public class Target {
    public String execute() {
        String message = "-----------test------------";
        System.out.println(message);
        return message;
    }
}
