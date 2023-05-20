package date230516;

public class Employees implements PrintInfoAble {
    public int number;
    public String name;
    public String phoneNumber;


    @Override
    public String toString() {
        return "사원번호: " + number + ", 사원명: " + name + ", 전화번호: " + phoneNumber;
    }


    @Override
    public void printInfo() {
        System.out.println(toString());
    }

}
