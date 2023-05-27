package date0526;

public class Bike implements ParkingAble{
    private String bikeName;
    private String name;
    public Bike(String bikeName, String name) {
        this.bikeName = bikeName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeName='" + bikeName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

}
