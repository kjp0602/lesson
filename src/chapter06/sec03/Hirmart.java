package chapter06.sec03;

/**
 * 예제) 매장에서 판매되는 상품은 computer, audio, notepad 이고 각각의 가격은 1000원, 300원 600원이다.
 * 이들의 매출을 수행하는 메서드 saleGoods 를 작성하라
 */
public class Hirmart {
    public static void main(String[] args) {
        int sum = 0;
        String list = "";
        Goods computer = new Goods("computer", 1000);
        Goods audio = new Goods("Audio", 300);
        Goods notepad = new Goods("Notepad", 600);

        //buyer 객체 생성
        Buyer buyer = new Buyer();

        sum = sum + buyer.saleGoods(computer, 2);
        list += notepad.getKind();

        sum = sum + buyer.saleGoods(audio, 3);
        list += ", " + notepad.getKind();

        sum = sum + buyer.saleGoods(notepad, 1);
        list += ", " + notepad.getKind();

        System.out.println("구매품목: " + list);
        System.out.println("구매금액: " + sum);
    }
}
