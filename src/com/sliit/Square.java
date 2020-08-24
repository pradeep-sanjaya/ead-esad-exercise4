package com.sliit;

public class Square extends Shape {

    public Square() {
        this.color = (Red) FactoryProducer
                .getFactory(FactoryProducer.COLOR)
                .getObject(ColorFactory.BLUE);
    }

    @Override
    public void draw() {
        System.out.println("draw square");
    }

    @Override
    public void fill() {
        color.fill();
    }
}
