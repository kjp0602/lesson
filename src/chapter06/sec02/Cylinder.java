package chapter06.sec02;

/**
 * 예제) 다음 조건을 만족하는 원통 Cylinder 클래스를 작성하시오.
 *
 * - 멤버필드 : 원 Cicle 클래스 객체, 실수 double 타입의 높이
 * - 메서드 : 생성자, 면적을 계산하여 반환하는  getArea() 메서드
 */
public class Cylinder {
    private double height;
    Circle circle;

    Cylinder() {}
    Cylinder (double height, Circle circle) {
        this.height = height;
        this.circle = circle;
    }

    public double getVolumn() {
        return height * circle.getArea();
    }

}
