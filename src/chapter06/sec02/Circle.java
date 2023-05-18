package chapter06.sec02;

public class Circle {
    /*
    원 넓이 구하기 : radius^2 * PIE
     */
    private double radius;
    private final double PI = 3.1415926;

    Circle(){}
    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }
}
