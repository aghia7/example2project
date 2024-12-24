package models;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double perimeter() {
        return getLength();
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
