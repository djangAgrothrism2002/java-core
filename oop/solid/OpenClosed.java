package oop.solid;

interface Shape {
    double calculateArea();
}

public class OpenClosed implements Shape {
    private double radius;

    public OpenClosed(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
