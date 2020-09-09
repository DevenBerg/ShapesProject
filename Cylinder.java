package org.cvtc.shapes;

public class Cylinder extends Shape {

    // Setting up variables to float values
    float radius = (float) 0.0;
    float height = (float) 0.0;

    // Constructor
    public Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
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
