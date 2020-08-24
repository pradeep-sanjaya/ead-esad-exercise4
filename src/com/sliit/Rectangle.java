package com.sliit;

public class Rectangle extends Shape {

    public Rectangle() {
        this.color = (Red) FactoryProducer
                .getFactory(FactoryProducer.COLOR)
                .getObject(ColorFactory.RED);
    }

    @Override
    public void draw() {
        System.out.println("Inside the Rectangle.draw() method");
    }

    @Override
    public void fill() {
        color.fill();
    }
}
