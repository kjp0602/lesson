package date230516;

import java.text.NumberFormat;

public class Products implements PrintInfoAble{

    public int productNumber;
    public String name;
    public String company;
    public long price;


    public String getPriceFormat() {
        return NumberFormat.getInstance().format(price);
    }

    @Override
    public String toString() {
        return "제품번호: " + productNumber + ", 제품명: " + name + ", 회사명: " + company + ", 가격: " + getPriceFormat();
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
    }
}
