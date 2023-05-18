package chapter06.sec02;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(32.5,new Circle(10));
        System.out.println("원통의 부피: " + cylinder.getVolumn());
    }
}
