package test;

import DAO.Shape;
import entity.Circle;
import entity.Rectangle;

class ShapeFactory {
    public static Shape getCircleInstance(){
        return new Circle();
    }
    public static Shape getRectangleInsrance(){
        return new Rectangle();
    }
}
