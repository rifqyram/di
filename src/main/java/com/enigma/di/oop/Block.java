package com.enigma.di.oop;

public class Block extends Rectangle {

    private Double height;

    public Block(Double length, Double width, Double height) {
        super(length, width);
        this.height = height;
    }

    @Override
    public Double getSurface() {
        return 2 * ((length * width) + (length * height) + (width * height));
    }

    // Mencari Volume

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
