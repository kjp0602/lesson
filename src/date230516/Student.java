package date230516;

public class Student implements PrintInfoAble{
    public long classNumber;
    public String name;
    @Override
    public String toString() {
        return "학번: " + classNumber + ", 이름: " + name;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
