package com.sliit;

public class CircleBuilder extends ShapeBuilder {

    private Shape shape;

    public CircleBuilder(Shape shape) {
        super();
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
    }

    @Override
    public void fill() {
        shape.fill();
    }

    @Override
    public Shape getShape() {
        return shape;
    }
}
