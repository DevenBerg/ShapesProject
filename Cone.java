package org.cvtc.shapes;

public class Cone extends Shape {

    // Defining Variables
    float radius = (float) 0.0;

    // Constructor
    public Cone(float radius) {
        this.radius = radius;
    }

    // Getters and Setters
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
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
