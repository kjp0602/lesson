package chapter06.sec02.deep;

import chapter06.sec02.deep.define.Shapes2D;

public class Rectangle implements Shapes2D {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void printInfo() {
        System.out.println("Rectangle!! width: " + this.width + ", height: " + height + ", area: " + getArea());
    }
}
