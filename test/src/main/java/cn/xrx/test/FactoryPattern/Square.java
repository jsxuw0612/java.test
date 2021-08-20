package cn.xrx.test.FactoryPattern;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:38
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
