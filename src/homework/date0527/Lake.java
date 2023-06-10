package homework.date0527;

public class Lake  extends Employee{
    public Lake (String name) {
        super(name);
    }
    public void JapanTour(){
        System.out.println(this.name + "일본으로 휴가를 갔다.");
    }
    public void JapanShopping(){
        System.out.println(this.name + "일본으로 쇼핑을 갔다.");
    }
  public void work(){
        JapanTour();
        JapanShopping();
    }
}
