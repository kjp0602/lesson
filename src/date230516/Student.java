package date230516;

public class Student implements PrintInfoAble{
    public long classNumber;
    public String name;

    public Student() {

    }
    public Student(long classNumber, String name) {
        this.classNumber = classNumber;
        this.name = name;
    }
    @Override
    public String toString() {
        return "학번: " + classNumber + ", 이름: " + name;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
