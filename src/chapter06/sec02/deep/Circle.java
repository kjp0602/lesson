package chapter06.sec02.deep;

import chapter06.sec02.deep.define.Shapes2D;

public class Circle implements Shapes2D {

    protected final double PIE = 3.1415926;
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {

        return radius * radius * PIE;
    }

    @Override
    public void printInfo() {
        System.out.println("Circle!! radius: " + this.radius + ", area: " + getArea());
    }
}
