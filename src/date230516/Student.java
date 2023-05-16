package date230516;

public class Student implements PrintInfoAble{
    private long classNumber;

    private String name;


    @Override
    public String toString() {
        return "학번: " + classNumber + ", 이름: " + name;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
