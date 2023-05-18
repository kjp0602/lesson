package chapter06.sec02.deep;

import chapter06.sec02.deep.define.Shapes3D;

public class Sphere extends Circle implements Shapes3D {

    Sphere(double radius) {
        super(radius);
    }
    Sphere(Circle circle) {

        super( circle.radius);
    }

    @Override
    public double getArea() {
        return 4 * super.PIE * super.radius * super.radius;
    }

    @Override
    public double getVolume() {
        return  4/3d * PIE * super.radius * super.radius * super.radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Sphere!! radius: " + this.radius + ", area: " + getArea()
        + ", volume: "+ getVolume());
    }
}
