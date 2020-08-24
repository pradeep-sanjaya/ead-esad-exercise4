package com.sliit;

public class Artist {

    private ShapeBuilder builder;

    public Artist(ShapeBuilder builder) {
        this.builder = builder;
    }

    public void constructShape() {
        builder.draw();
        builder.fill();
    }

    public Shape getShape() {
        return builder.getShape();
    }
}
