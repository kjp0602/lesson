package chapter06.sec02.deep;

import chapter06.sec02.deep.define.Shapes;

public class Main {
    public static void main(String[] args) {
        Shapes circle = new Circle(10);
        Shapes triangle = new Triangle(8,6);
        Shapes rectangle = new Rectangle(7, 12);
        Shapes Sphere = new Sphere((Circle)circle);
        Shapes[] shapesArr = {circle, triangle, rectangle, Sphere};
        for (Shapes shapes: shapesArr) {
            shapes.printInfo();
        }


    }
}
