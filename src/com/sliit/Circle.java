package com.sliit;

public class Circle extends Shape {

    public Circle() {
        this.color = (Green) FactoryProducer
                .getFactory(FactoryProducer.COLOR)
                .getObject(ColorFactory.GREEN);
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle.draw() method");
    }

    @Override
    public void fill() {
        color.fill();
    }
}
