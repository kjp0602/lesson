package date230516;

public class Products implements PrintInfoAble{

    public int productNumber;
    public String name;

    public String company;
    public long price;


    @Override
    public String toString() {
        return "제품번호: " + productNumber + ", 제품명: " + name + ", 회사명: " + company + ", 가격: " + price;
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
