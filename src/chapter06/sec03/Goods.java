package chapter06.sec03;

public class Goods {
    private String kind;
    private int price;

    Goods() {}
    Goods(String kind, int price) {
        this.kind = kind;
        this.price = price;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
