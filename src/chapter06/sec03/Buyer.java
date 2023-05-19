package chapter06.sec03;

public class Buyer {
    public int saleGoods(Goods goods, int amt) {
        return goods.getPrice() * amt;
    }
}
