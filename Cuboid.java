package org.cvtc.shapes;

public class Cuboid extends Shape {

    // Setting up variables to float values
    float width  = (float) 0.0;
    float height = (float) 0.0;
    float depth = (float) 0.0;

    // Constructor
    public Cuboid(float width, float height, float depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Getters and Setters
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    // Override methods for inheritance
    @Override
    public float surfaceArea() {
        return 0;
    }

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public void render() {

    }
}
