package chapter06.sec02.deep;

import chapter06.sec02.deep.define.Shapes2D;

public class Triangle implements Shapes2D {

    double width, height;
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return this.width * this.height / 2;
    }

    @Override
    public void printInfo() {
        System.out.println("Triangle!! width: " + this.width + ", height: " + height + ", area: " + getArea());
    }
}
