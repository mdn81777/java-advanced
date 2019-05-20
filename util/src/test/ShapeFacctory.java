package test;

class ShapeFactory {
    public static Shape getCircleInstance(){
        return new Circle();
    }
    public static Shape getRectangleInsrance(){
        return new Rectangle();
    }
}
