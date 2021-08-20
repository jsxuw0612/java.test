package cn.xrx.test.FactoryPattern;

import javafx.scene.shape.Circle;

import java.util.Locale;

/**
 * Description:
 *
 * @author xrx
 * @date create on 2021/8/13 14:39
 */
public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        shapeType = shapeType.toLowerCase();
        switch (shapeType) {
            // case "circle":
            //     return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }

    }
}
