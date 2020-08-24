package com.sliit;

public class BuilderDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.SHAPE);

        Rectangle rectangle = (Rectangle)shapeFactory.getObject(ShapeFactory.RECTANGLE);
        ShapeBuilder rectangleBuilder = new RectangleBuilder(rectangle);
        Artist artist1 =  new Artist(rectangleBuilder);
        artist1.constructShape();

        Circle circle = (Circle) shapeFactory.getObject(ShapeFactory.CIRCLE);
        ShapeBuilder circleBuilder = new CircleBuilder(circle);
        Artist artist2 =  new Artist(circleBuilder);
        artist2.constructShape();

    }
}
