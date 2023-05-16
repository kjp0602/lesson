package date230516;

public class Employees implements PrintInfoAble {
    private int number;
    private String name;
    private String phoneNumber;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "사원번호: " + getNumber() + ", 사원명: " + getName() + ", 전화번호: " + getPhoneNumber();
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
