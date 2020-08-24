package com.sliit;

public class RectangleBuilder extends ShapeBuilder {

    private Shape shape;

    public RectangleBuilder(Shape shape) {
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
        System.out.println("Returning shape");
        return shape;
    }
}
