package date230516;

public class Student implements PrintInfoAble{
    private long classNumber;

    private String name;

    public long getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(long classNumber) {
        this.classNumber = classNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "학번: " + getClassNumber() + ", 이름: " + getName();
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
